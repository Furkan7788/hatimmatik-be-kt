package com.fuki.hatimmatik.infrastructure.cron.section

import com.fuki.hatimmatik.application.user.service.SectionService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class SectionJob(
    private val sectionService: SectionService,
) {
    @Scheduled(cron = "0 0 23 * * THU")
    fun makeHatim() {
        println("New Hatim Init Started")
        sectionService.makeHatim()
        println("New Hatim Init Finished")
    }
}
