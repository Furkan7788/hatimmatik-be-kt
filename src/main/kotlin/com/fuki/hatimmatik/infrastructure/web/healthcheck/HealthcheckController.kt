package com.fuki.hatimmatik.infrastructure.web.healthcheck

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthcheckController {
    @GetMapping("/healthcheck")
    fun healthcheck(): String = "OK"
}
