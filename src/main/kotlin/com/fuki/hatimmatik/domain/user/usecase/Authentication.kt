package com.fuki.hatimmatik.domain.user.usecase

import com.fuki.hatimmatik.domain.user.core.User

interface Authentication {
    fun execute(user: User): Output

    data class Command(
        val username: String,
    )

    data class Output(
        val boolean: Boolean,
    )
}
