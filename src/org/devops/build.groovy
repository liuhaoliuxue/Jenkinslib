package org.devops

//构建类型
//传入参数构建类型，构建命令
def Build(buildType,buildShell){
    def buildTools=["Maven":"m2","Ant":"ant","Gradle":"Gradle","Npm":"NPM"]
    println("当前选择的构建类型为 ${buildType}")
    buildHome = tool buildTools[buildType]
    
    sh "${buildHome}/bin/${buildType} ${buildShell}"
    

}
