def call(String msg = 'deploy_dev') {
echo "${msg}"
deploy adapters: [tomcat8(credentialsId: 'TOMCAT_CREDENTIALS', path: '', url: 'http://18.217.38.203:8090/')], contextPath: null, onFailure: false, war: '**/*.war'
            }

