//package plugins
//
//import org.gradle.api.Plugin
//import org.gradle.api.Project
//import org.gradle.api.plugins.WarPlugin
//import tasks.MyTask
//
//class MyPlugin implements Plugin<Project>{
//
//    @Override
//    void apply(Project project) {
//        project.plugins.apply(WarPlugin)
//        addTasks(project)
//    }
//
//    private void addTasks(Project project) {
//        project.task('somePluginTask', type: MyTask) {
//            inpFile = new File("/home/k.buglak/IdeaProjects/gradleExample/version.properties")
//            outFile = new File("/home/k.buglak/IdeaProjects/gradleExample/gradle.properties")
//            doLast(a -> println 'Plugin task')
//        }
//    }
//}
