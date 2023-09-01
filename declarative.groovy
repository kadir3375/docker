pipeline {
    agent any
    stages {
        stage('pull') { 
            steps {
                git branch: 'main', url: 'https://github.com/kadir3375/docker.git'
            }
 
       }
       stage('build') { 
            steps {
                  sh "docker build -t nginx:tag ."
            }
                }
                 
        }
       
    }