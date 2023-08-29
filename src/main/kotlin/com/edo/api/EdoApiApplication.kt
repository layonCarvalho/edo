package com.edo.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EdoApiApplication

fun main(args: Array<String>) {
	runApplication<EdoApiApplication>(*args)
}
