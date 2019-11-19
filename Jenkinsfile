pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') { 
          steps {
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

