package io.pivotal.halfmoon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HalfmoonApplication

fun main(args: Array<String>) {
    runApplication<HalfmoonApplication>(*args)
}
