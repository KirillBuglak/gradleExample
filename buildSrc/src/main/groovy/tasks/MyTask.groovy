package tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

class MyTask extends DefaultTask {
    @InputFile
    File inpFile
    @OutputFile
    File outFile

    MyTask() {
        group = 'custom tasks'
        description = 'this task depends on input and output files - thus change in input or output triggers the task to be not UP-TO-DATE'
    }

    @TaskAction
    void start() {
        println("Works!!!")
    }
}
