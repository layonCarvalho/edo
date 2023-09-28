<<<<<<< HEAD:src/main/kotlin/com/edo/api/order/controller/OrderController.kt
package com.edo.api.order.controller

import com.edo.api.order.entities.OrderItem

data class OrderResult(
    val processedItems: MutableList<OrderItem> = mutableListOf(),
    val unavailableItems: MutableList<OrderItem> = mutableListOf(),
    val notFoundItems: MutableList<OrderItem> = mutableListOf()
=======
package com.edo.api.controller.controller.order

import com.edo.api.entities.user.OrderItem

data class OrderController(
        val processedItems: MutableList<OrderItem> = mutableListOf(),
        val unavailableItems: MutableList<OrderItem> = mutableListOf(),
        val notFoundItems: MutableList<OrderItem> = mutableListOf()
>>>>>>> 03033b46db96af684443b670fe0642a82eb2f5fe:src/main/kotlin/com/edo/api/controller/order/OrderController.kt
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
