package org.example

import org.gradle.api.Project
import org.gradle.api.Plugin

class CmakePlugin implements Plugin<Project> {
    void apply(Project target) {
        target.task('cmake', type: CmakeTask)
    }
}


