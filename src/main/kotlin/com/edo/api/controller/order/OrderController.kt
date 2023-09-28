package com.edo.api.controller.controller.order

import com.edo.api.entities.user.OrderItem

data class OrderController(
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
