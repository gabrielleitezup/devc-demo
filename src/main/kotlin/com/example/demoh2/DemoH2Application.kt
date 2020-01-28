package com.example.demoh2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoH2Application

fun main(args: Array<String>) {
	runApplication<DemoH2Application>(*args)
}
