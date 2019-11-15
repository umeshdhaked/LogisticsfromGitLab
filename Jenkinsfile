pipeline {
    agent any
    stages {
        stage('Build') { 
          steps {
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
