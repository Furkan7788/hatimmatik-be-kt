package com.fuki.hatimmatik

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class HatimmatikApplication

fun main(args: Array<String>) {
    runApplication<HatimmatikApplication>(*args)
}
