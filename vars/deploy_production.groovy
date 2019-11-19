def call(String msg = 'deploy_prod') {
echo "${msg}"
                 sh 'ssh -t -t -i /var/lib/jenkins/.ssh/id_rsa ansadmin@172.31.37.71 "ansible-playbook /opt/playbooks/production.yml"'

}
