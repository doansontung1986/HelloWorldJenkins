pipeline {
    agent any
    tools {
            maven 'Maven 3.6.3'
            jdk 'jdk8'
        }
    stages {
        stage('Cleaning Stage') {
            steps {
                sh "mvn clean"
            }
        }
        stage('Testing Stage') {
            steps {
                sh "mvn test"
            }
        }
        stage('Packaging Stage') {
            steps {
                sh "mvn package"
            }
        }
    }
}