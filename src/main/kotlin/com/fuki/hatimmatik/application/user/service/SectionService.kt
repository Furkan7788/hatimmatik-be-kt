package com.fuki.hatimmatik.application.user.service

import com.fuki.hatimmatik.domain.user.core.Section
import com.fuki.hatimmatik.infrastructure.repository.h2.user.SectionRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

const val LAST_INDEX_OF_SECTIONS = 30
const val FIRST_INDEX_OF_SECTIONS = 1

@Service
class SectionService(
    val repository: SectionRepository,
) {
    fun findSectionByUserId(userId: Long): Section? = repository.findByUserId(userId)

    fun makeHatim() {
        val sections: List<Section> = repository.findAll()
        val startDate = LocalDateTime.now()
        val endDate = startDate.plusWeeks(1)
        sections.forEach { section ->
            println(section)
            run {
                section.isRead = false
                section.startDate = startDate.toString()
                section.endDate = endDate.toString()
                if (section.index != LAST_INDEX_OF_SECTIONS) {
                    section.index++
                } else {
                    section.index = FIRST_INDEX_OF_SECTIONS
                }

                repository.save(section)
            }
        }
    }
}
