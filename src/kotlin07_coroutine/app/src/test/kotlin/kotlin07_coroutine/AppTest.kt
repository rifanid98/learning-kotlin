/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package kotlin07_coroutine

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class AppTest {
    @Test fun testAppHasAGreeting() {
        val classUnderTest = App()
        Assertions.assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
