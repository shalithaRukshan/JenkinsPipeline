node{
  stage('SCM checkout'){
    git 'https://github.com/shalithaRukshan/JenkinsPipeline'
  }
  stage('Compile-Package'){
    def mvnHome =  tool name: 'maven-jenkins', type: 'maven'
    bat "${mvnHome}\\bin\\mvn package"
  }
  stage('Email Notification'){
  mail bcc: '', body: 'Hi Jenkins doing the job', cc: '', from: '', replyTo: '', subject: 'Jenkins Job', to: 'mdsrwijethilaka@gmail.com'
  }
}
