package com.fuki.hatimmatik.domain.user.core

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

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
)
