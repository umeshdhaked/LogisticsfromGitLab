pipeline {
    agent {
   docker {
         image 'maven:3-alpine'
         args '-v /var/lib/jenkins/.m2:/root/.m2'
   }
}
    
    stages {
        stage('Build') { 
          steps {
                sh 'cd /home && ls -la'
                sh 'cd /home/ubuntu && ls -la'
                sh 'pwd; ls -la; cd; ls -la; pwd'
                sh 'cd && ls -la | grep .m2'
                sh 'ls -la'
                sh 'mvn -B -DskipTests clean compile package' 
            }
        }
	    stage('Test') {
	        
	        steps {
                sh 'mvn test' 
            }
        } 
    }
}

