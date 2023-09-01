pipeline {
    agent any
    stages {
        stage('pull') { 
            steps {
                git branch: 'main', url: 'https://github.com/kadir3375/FDEC_studentapp_Project.git'
            }
 
       }
       stage('build') { 
            steps {
                  sh "docker build -t studentapp:tag ."
            }
                }

               stage('deploy') { 
            steps {
                  sh "docker run studentapp "
            }
                }
                   
        }
       
    }