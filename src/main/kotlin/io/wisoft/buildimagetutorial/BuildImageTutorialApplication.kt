package io.wisoft.buildimagetutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class BuildImageTutorialApplication {
    @RequestMapping("/")
    fun hello(): String = "Hello Docker World"
}

fun main(args: Array<String>) {
    runApplication<BuildImageTutorialApplication>(*args)
}
