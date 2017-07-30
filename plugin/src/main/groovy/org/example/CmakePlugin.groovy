package org.example

import org.gradle.api.Project
import org.gradle.api.Plugin

class CmakePlugin implements Plugin<Project> {
    static final String EXTENSION_NAME = 'cmakeConfig'

    void apply(Project project) {
        project.extensions.create(EXTENSION_NAME, CmakePluginExtension)

        project.task('cmake', type: CmakeTask) {
            def extension = project.extensions.findByName(EXTENSION_NAME)
            println extension.generator
            conventionMapping.generator = {extension.generator}
        }
    }
}


