package com.fuki.hatimmatik.domain.user.core

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

const val LAST_INDEX_OF_SECTIONS = 30
const val FIRST_INDEX_OF_SECTIONS = 1

@Entity
@Table(name = "\"section\"")
data class Section(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long = 0,
    @Column(name = "sectionindex")
    var index: Int = 0,
    @Column(name = "userid")
    var userId: Int = 0,
    @Column(name = "isread")
    var isRead: Boolean = false,
    @Column(name = "team")
    var team: String = "",
    @Column(name = "startdate")
    var startDate: String = "",
    @Column(name = "enddate")
    var endDate: String = "",
) {
    fun makeHatim() {
        val startDate = LocalDateTime.now()
        val endDate = startDate.plusWeeks(1)

        this.isRead = false
        this.startDate = startDate.toString()
        this.endDate = endDate.toString()
        if (this.index != LAST_INDEX_OF_SECTIONS) {
            this.index++
        } else {
            this.index = FIRST_INDEX_OF_SECTIONS
        }
    }

    fun read() {
        this.isRead = true
    }

    fun unRead() {
        this.isRead = false
    }
}
