package team.scrumble.scrumble

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ScrumbleApplication

fun main(args: Array<String>) {
	runApplication<ScrumbleApplication>(*args)
}
