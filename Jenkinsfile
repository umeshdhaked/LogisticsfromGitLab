pipeline {
    agent any
    stages {
     stage('Get Into AWS') {
            steps {
                sh 'cd;pwd;ls -la .ssh/; less .ssh/id_rsa.pub'
                sh 'whoami'
                sh 'ssh ubuntu@15.206.105.26 "cd stackroute-product; sudo docker-compose down"'
                sh 'ssh ubuntu@15.206.105.26 "cd stackroute-product"'
                sh 'ssh ubuntu@15.206.105.26 "cd stackroute-product;  git checkout master“‘'
                sh 'ssh ubuntu@15.206.105.26 "cd stackroute-product;  git pull "'
                sh 'ssh ubuntu@15.206.105.26 "cd stackroute-product; mvn clean compile package "'
                sh 'ssh ubuntu@15.206.105.26 "cd stackroute-product; sudo docker-compose up"'
            }
        }
    }
}