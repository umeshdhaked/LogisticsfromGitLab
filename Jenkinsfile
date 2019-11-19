pipeline {
    agent any
    }
    stages {
        stage('Build') { 
          steps {
                sh 'pwd; ls -la; cd; ls -la'
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

