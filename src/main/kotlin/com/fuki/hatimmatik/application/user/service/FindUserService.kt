package com.fuki.hatimmatik.application.user.service

import com.fuki.hatimmatik.domain.user.core.User
import com.fuki.hatimmatik.infrastructure.repository.h2.user.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class FindUserService(
    val repository: UserRepository,
) {
    fun findUser(username: String): User? {
        println("$username try to enter system")
        return repository.findByUsername(username) ?: throw ResponseStatusException(
            HttpStatus.NOT_FOUND,
            "Kullanıcı bulunamadı",
        )
    }
}
