package com.fuki.hatimmatik.application.user.service

import com.fuki.hatimmatik.domain.user.core.User
import com.fuki.hatimmatik.infrastructure.repository.h2.user.UserRepository
import org.springframework.stereotype.Service

@Service
class FindUserService(
    val repository: UserRepository,
) {
    fun findUser(username: String): User? = repository.findByUsername(username)
}
