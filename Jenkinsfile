pipeline {
    agent any                                                                                  //Runs on any available agent

    tools{
        maven 'maven_home'                                                                     //'maven_home' is the tool name defined in Jenkins Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/yellayakshi-bijji/maven-project-1.git'                //checkout the source code from the version control system (e.g., Git)
            }
        }
        stage('Clean') {
            steps {
                sh 'mvn clean'                                                      
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn compile'                                                      
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'                                                     
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'                                      
            }
        }
        stage('Build'){
            steps{
                sh 'mvn install'
            }
        }
    } 
    post{
        success{
            emailext subject: 'Build Success',
                        body: 'The Jenkins pipeline has completed successfully',
                          to: 'yellayakshi.bijji.135@gmail.com'
        }
    }
} 