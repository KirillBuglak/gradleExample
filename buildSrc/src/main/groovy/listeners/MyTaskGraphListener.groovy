package listeners

import org.gradle.api.execution.TaskExecutionGraph
import org.gradle.api.execution.TaskExecutionGraphListener

class MyTaskGraphListener implements TaskExecutionGraphListener{

    @Override
    void graphPopulated(TaskExecutionGraph graph) {
        println("Listener is added")
    }
}
