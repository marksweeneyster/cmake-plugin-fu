package org.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.process.internal.ExecAction

class CmakeTask extends DefaultTask {
    String greeting = 'hello from CmakeTask'
    String generator = 'Ninja'

    @TaskAction
    def cmake() {
        println greeting
        println "CMake generator: " + generator 
    }
}

