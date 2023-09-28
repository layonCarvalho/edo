package com.edo.api.order.controller

import com.edo.api.order.entities.OrderItem

data class OrderResult(
    val processedItems: MutableList<OrderItem> = mutableListOf(),
    val unavailableItems: MutableList<OrderItem> = mutableListOf(),
    val notFoundItems: MutableList<OrderItem> = mutableListOf()
) {
    fun addProcessedItem(item: OrderItem) {
        processedItems.add(item)
    }

    fun addUnavailableItem(item: OrderItem) {
        unavailableItems.add(item)
    }

    fun addNotFoundItem(item: OrderItem) {
        notFoundItems.add(item)
    }
}
