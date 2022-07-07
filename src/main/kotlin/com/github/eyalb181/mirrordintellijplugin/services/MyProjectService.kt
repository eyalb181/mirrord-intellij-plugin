package com.github.eyalb181.mirrordintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.eyalb181.mirrordintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
