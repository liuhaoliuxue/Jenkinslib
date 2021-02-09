package org.devops

//ansible
def AnsibleDeploy(host,func){
    sh "ansible ${host} ${func}"
}
