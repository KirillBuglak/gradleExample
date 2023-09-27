package listeners

import org.gradle.api.tasks.testing.TestDescriptor
import org.gradle.api.tasks.testing.TestListener
import org.gradle.api.tasks.testing.TestResult

class MyTestListener implements TestListener{
    @Override
    void beforeSuite(TestDescriptor testDescriptor) {

    }

    @Override
    void afterSuite(TestDescriptor testDescriptor, TestResult testResult) {
        def count = testResult.testCount
        System.err.println("After suite has finished $count tasks")
    }

    @Override
    void beforeTest(TestDescriptor testDescriptor) {

    }

    @Override
    void afterTest(TestDescriptor testDescriptor, TestResult testResult) {

    }
}
