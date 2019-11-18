pipeline {
    agent any
    stages {
     stage('Get Into AWS') {
            
            steps {
                sh 'cd;pwd;ls -la .ssh/; less .ssh/id_rsa.pub'
                
                sh 'whoami'
                
                sh 'ssh ubuntu@15.206.105.26 "cd prod; rm -rf logisticpipeline-demo"'
                sh 'ssh ubuntu@15.206.105.26 "sudo apt install maven"'
                sh 'ssh ubuntu@15.206.105.26 "cd prod;  git clone @gitlab-cgi.stackroute.in:cgi-wave14/logistics-routing.git -b demo"'
                sh 'ssh ubuntu@15.206.105.26 "cd prod; mvn clean compile package "'
                sh 'ssh ubuntu@15.206.105.26 "cd prod; sudo docker-compose up"'

                
            }
        }
    }
}
