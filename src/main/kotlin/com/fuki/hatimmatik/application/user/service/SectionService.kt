package com.fuki.hatimmatik.application.user.service

import com.fuki.hatimmatik.domain.user.core.Section
import com.fuki.hatimmatik.infrastructure.repository.h2.user.SectionRepository
import org.springframework.stereotype.Service

@Service
class SectionService(
    val repository: SectionRepository,
) {
    fun findSectionByUserId(userId: Long): Section? = repository.findByUserId(userId)

    fun makeHatim() {
        val sections: List<Section> = repository.findAll()

        sections.forEach { section ->
            run {
                section.makeHatim()
                repository.save(section)
            }
        }
    }

    fun read(index: Int): Section {
        val section: Section = repository.findByIndex(index)

        section.read()
        repository.save(section)

        return section
    }

    fun unRead(index: Int): Section {
        val section: Section = repository.findByIndex(index)

        section.unRead()
        repository.save(section)

        return section
    }

    fun findAllSections(): List<Section> = repository.findAll()
}
