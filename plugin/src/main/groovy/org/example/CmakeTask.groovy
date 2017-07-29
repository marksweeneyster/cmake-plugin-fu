package org.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.Exec
import org.gradle.process.internal.ExecAction

class CmakeTask extends Exec {
    String greeting = 'hello from CmakeTask'
    String generator = 'Ninja'


    public CmakeTask() {
        executable 'cmake'

        args = ['-G'+generator, "build/"];
    }

    @Override
    protected void exec() {
        super.exec()
    }

    @TaskAction
    def cmake() {
        println greeting
        println "CMake generator: " + generator 
    }
}

