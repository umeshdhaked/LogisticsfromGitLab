pipeline {
    agent any
    stages {
        stage('Build') { 
         when{
            branch 'v1.0.0'
        }
            steps {
                sh 'mvn -B -DskipTests clean compile package' 
            }
        }
	    stage('Test') {
	        when{
                 branch 'v1.0.0'
            }
		        steps {
                    sh 'mvn test'
                }
            
        }
        stage('Get Into AWS') {
            when{
                 branch 'master'
            }
            
            steps {
                sh 'cd;pwd;ls -la .ssh/; less .ssh/id_rsa.pub'
                
                sh 'whoami'
                sh 'ssh ubuntu@15.206.105.26 "cd prod; sudo docker-compose down"'
                sh 'ssh ubuntu@15.206.105.26 "cd prod; rm -rf logisticpipeline-demo"'
                sh 'ssh ubuntu@15.206.105.26 "cd prod;  git@gitlab-cgi.stackroute.in:cgi-wave14/logistics-routing.git -b demo"'
                sh 'ssh ubuntu@15.206.105.26 "cd prod; cd logisticpipeline-demo; ls -la; git branch; git status; git checkout master; ls -la"'
                sh 'ssh ubuntu@15.206.105.26 "cd prod; sudo docker-compose up"'
                
            }
        }

	
    }
}
