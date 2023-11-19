pipeline {
    agent any
    stages {
        stage('Cleaning Stage') {
            steps {
                dir("HelloWorldJenkins") {
                    sh "mvn clean"
                }
            }
        }
        stage('Testing Stage') {
            steps {
                dir("HelloWorldJenkins") {
                    sh "mvn test"
                }                                
            }
        }
        stage('Packaging Stage') {
            steps {
                dir("HelloWorldJenkins") {
                    sh "mvn package"
                }                                    
            }
        }
    }
}
