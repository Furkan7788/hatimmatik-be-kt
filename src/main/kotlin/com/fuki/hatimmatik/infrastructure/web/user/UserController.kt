package com.fuki.hatimmatik.infrastructure.web.user

import com.fuki.hatimmatik.application.user.service.FindUserService
import com.fuki.hatimmatik.domain.user.core.User
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["*"])
class UserController(
    val service: FindUserService,
) {
    @GetMapping("/user/{username}")
    fun getUser(
        @PathVariable username: String,
    ): User? = service.findUser(username)
}
