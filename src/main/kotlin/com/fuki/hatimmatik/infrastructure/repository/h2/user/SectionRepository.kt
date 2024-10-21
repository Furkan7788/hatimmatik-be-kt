package com.fuki.hatimmatik.infrastructure.repository.h2.user

import com.fuki.hatimmatik.domain.user.core.Section
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SectionRepository : JpaRepository<Section, Long> {
    fun findByUserId(userId: Long): Section?
}
