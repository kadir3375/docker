pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
                git 'https://github.com/kadir3375/Docker.git'
            }
 
       }
       stage('build') { 
            steps {
                 sh 'docker build -t nginx:tag .'
            }
        }
    }
}