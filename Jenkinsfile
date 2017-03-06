node {
    try {
        stage('Checkout') {
            startBuildNotification()
            checkout scm
            sh 'git clean -fdx'
        }

        stage('Build') {
            sh "${tool 'M3'}/bin/mvn source:jar deploy"
        }
    } catch (Exception e) {
        failBuild 'Failure', e
    }
}
