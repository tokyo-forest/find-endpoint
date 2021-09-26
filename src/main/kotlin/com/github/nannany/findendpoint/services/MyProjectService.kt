package com.github.nannany.findendpoint.services

import com.intellij.openapi.project.Project
import com.github.nannany.findendpoint.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
