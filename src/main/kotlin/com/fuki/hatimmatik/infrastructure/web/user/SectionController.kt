package com.fuki.hatimmatik.infrastructure.web.user

import com.fuki.hatimmatik.application.user.service.SectionService
import com.fuki.hatimmatik.domain.user.core.Section
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class SectionController(
    val service: SectionService,
) {
    @GetMapping("/section/{userId}")
    fun getUser(
        @PathVariable userId: Long,
    ): Section? = service.findSectionByUserId(userId)
}
