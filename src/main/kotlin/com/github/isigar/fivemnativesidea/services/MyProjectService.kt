package com.github.isigar.fivemnativesidea.services

import com.github.isigar.fivemnativesidea.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
