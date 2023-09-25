package com.edo.api.entites.user

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id



@Entity(name = "stock")
data class Stock(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var name: String = "",
        var price: Double = 0.0,
        var amount: Int = 0
)