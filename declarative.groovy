pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
                git 'https://github.com/rajatpzade/devops-b27.git'
            }
 
       }
       
    }
}