package com.edo.api.entities.user

import javax.persistence.*

@Entity(name = "orders")
data class Order(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
        @JoinColumn(name = "order_id")
        val orderItems: MutableList<OrderItem> = mutableListOf()
)

@Entity(name = "order_items")
data class OrderItem(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val productId: Long,
        val quantity: Int
)
