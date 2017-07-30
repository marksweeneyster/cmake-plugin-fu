package org.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.Exec
import org.gradle.process.internal.ExecAction

class CmakeTask extends Exec {
    String greeting = 'hello from CmakeTask'

    @Input
    String generator = 'Ninja'

    public CmakeTask() {
        executable 'cmake'

        setWorkingDir("build")

        println "CMake generator: " + generator
        args = ['-G'+generator, ".."];
    }

    @Override
    protected void exec() {
        super.exec()
    }

    @TaskAction
    def cmake() {
        println greeting
        args = ['-G'+generator, ".."];
        executable 'cmake'
    }
}

