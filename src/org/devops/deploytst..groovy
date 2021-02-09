package org.devops

//ansible
def AnsibleDeploy(host,func){
    //传入主机组，指令
    sh "ansible ${host} ${func}"
}
