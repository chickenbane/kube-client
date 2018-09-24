package github.joeyslalom.testr

import org.junit.platform.console.ConsoleLauncher
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class TestrApplication {
    @Bean
    fun junitRunner() = ApplicationRunner {
        ConsoleLauncher.main("-p", "github.joeyslalom.testr.test")
    }
}

fun main(args: Array<String>) {
    runApplication<TestrApplication>(*args)
}
