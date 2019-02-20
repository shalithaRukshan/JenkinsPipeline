node{
  stage('SCM checkout'){
    git 'https://github.com/shalithaRukshan/JenkinsPipeline'
  }
  stage('Compile-Package'){
    def mvnHome =  tool name: 'maven-jenkins', type: 'maven'
    bat "${mvnHome}\bin\mvn package"
  }
}
