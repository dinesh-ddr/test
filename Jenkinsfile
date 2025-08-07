pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building branch: ${env.BRANCH_NAME}"
                //sh './build.sh'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                //sh './run-tests.sh'
            }
        }
    }
}
