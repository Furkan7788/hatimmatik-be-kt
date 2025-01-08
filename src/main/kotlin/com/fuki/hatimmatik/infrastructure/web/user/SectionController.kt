package com.fuki.hatimmatik.infrastructure.web.user

import com.fuki.hatimmatik.application.user.service.SectionService
import com.fuki.hatimmatik.domain.user.core.Section
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["*"])
class SectionController(
    val service: SectionService,
) {
    @GetMapping("/section/{userId}")
    fun getSection(
        @PathVariable userId: Long,
    ): Section? = service.findSectionByUserId(userId)

    @GetMapping("/sections")
    fun getAllSections(): List<Section> = service.findAllSections()

    @PatchMapping("/section/read/{index}")
    fun read(
        @PathVariable index: Int,
    ): Section = service.read(index)

    @PatchMapping("/section/unread/{index}")
    fun unRead(
        @PathVariable index: Int,
    ): Section = service.unRead(index)
}
