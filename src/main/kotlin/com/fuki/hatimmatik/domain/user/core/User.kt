package com.fuki.hatimmatik.domain.user.core

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "\"user\"")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long = 0,
    @Column(name = "username")
    var username: String = "",
    @Column(name = "type")
    var type: String = "",
    @Column(name = "team")
    var team: String = "",
)
