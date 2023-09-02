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
                  sh "sudo docker build -t studentapp ."
            }
                }

               stage('deploy') { 
            steps {
                  sh "sudo docker run -p 8081:8080 studentapp "
            }
                }
                   
        }
       
    }