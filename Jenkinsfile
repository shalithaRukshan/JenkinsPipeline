node{
  stage('SCM checkout'){
    git 'https://github.com/shalithaRukshan/JenkinsPipeline'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
