pipeline {
    agent any
    stages {
        stage('git clone') {
            steps {
                sh 'git clone --branch=master https://github.com/bayukrsn/Bayu-springboot-mandiri.git'
            }
        }
        stage('build') {
            steps {
                sh  '''
                    cd /home/bayu/bayu-springboot/bayu-example-spring-boot
                    docker build -t bayu-springboot:v3 .
                    '''
            }
        }
        stage('push to container registry') {
            steps {
                sh "docker push bayukrsn/bayu-springboot:v3"
            }
        }
        stage('deploy app') {
            steps {
                sh  ''' 
                    kubectl apply bayu-springboot-deployment.yaml
                    kubectl apply bayu-springboot-secret.yaml -n development
                    kubectl apply bayu-springboot-service.yaml -n development
                    kubectl apply bayu-springboot-ingress.yaml -n development
                    '''
            }
        }
    }
    post {
        always {
            cleanWs()
            }
        }
}
