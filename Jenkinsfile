pipeline {
    agent any
    stages {
     stage('Get Into AWS') {
            steps {
                sh 'cd;pwd;ls -la .ssh/; less .ssh/id_rsa.pub'
                sh 'whoami'
                sh 'ssh ubuntu@15.206.105.26 "cd stackroute-product/logistics-routing; sudo docker-compose down"'
                sh 'ssh ubuntu@15.206.105.26 "cd stackroute-product/logistics-routing;  git checkout master“'
                sh 'ssh ubuntu@15.206.105.26 "cd stackroute-product/logistics-routing;  git pull origin master “'
                sh 'ssh ubuntu@15.206.105.26 "cd stackroute-product/logistics-routing; mvn clean compile package "'
                sh 'ssh ubuntu@15.206.105.26 "cd stackroute-product/logistics-routing; sudo docker-compose up --build"'
            }
        }
    }
}