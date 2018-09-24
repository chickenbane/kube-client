package github.joeyslalom.testr.test

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class TestrApplicationTests {

    @MockBean
    lateinit var junitRunner: ApplicationRunner

    @Test
    fun contextLoads() {
    }

    @Test
    fun firstTest() {
        println("oh hello")
        assertTrue(true)
    }

    @Test
    fun secondTest() {
        println("womp womp")
        assertTrue(false)
    }

}
