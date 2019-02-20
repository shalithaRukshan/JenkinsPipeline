node{
  stage('SCM checkout'){
    git 'https://github.com/shalithaRukshan/JenkinsPipeline'
  }
  stage('Compile-Package'){
    def mvnHome =  tool name: 'maven-jenkins', type: 'maven'
    bat "${mvnHome}\\bin\\mvn package"
  }
  stage('SonarQube Analysis'){
    def mvnHome =  tool name: 'maven-jenkins', type: 'maven'
    withSonarQubeEnv('MySonarServer'){
      bat "${mvnHome}\\bin\\mvn sonar:sonar"
    }
  }
  stage('Quality Gate status Check'){
    timeout(time:1, unit:'HOURS'){
      def qg =  waitForQualityGate()
      if(qg.status != 'OK'){
        error "Pipeline aborted due to quality gate failure : ${qg.status} "
      }
    }
  }
  stage('Email Notification'){
    mail bcc: '', body: 'Hi Jenkins doing the job', cc: '', from: '', replyTo: '', subject: 'Jenkins Job', to: 'mdsrwijethilaka@gmail.com'
  }
}
