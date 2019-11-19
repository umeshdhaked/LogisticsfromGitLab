pipeline {
    agent any
    
    stages {
        stage('Build') { 
          steps {
                sh 'cd /home && ls -la'
                sh 'pwd; ls -la; cd; ls -la'
                sh 'cd && ls -la | grep .m2'
                sh 'ls -la'
                sh 'cd root;ls -la'
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

