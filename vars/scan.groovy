def call(String msg = 'SCAN') {
echo "${msg}"
appscan application: '01a6d85b-1a98-4f7a-9406-2e557830c0ba', credentials: 'IBM credentials', email: true, failBuild: true, failureConditions: [failure_condition(failureType: 'medium', threshold: 1000), failure_condition(failureType: 'high', threshold: 1000), failure_condition(failureType: 'low', threshold: 1000)], name: 'spring test', scanner: static_analyzer(hasOptions: false, target: '/var/lib/jenkins/workspace/'), type: 'Static Analyzer', wait: true
}
