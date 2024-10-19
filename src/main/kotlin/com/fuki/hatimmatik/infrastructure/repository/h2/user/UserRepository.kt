package com.fuki.hatimmatik.infrastructure.repository.h2.user

import com.fuki.hatimmatik.domain.user.core.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByUsername(username: String): User?
}
