package com.edo.api.order.service

import com.edo.api.order.entities.Order
import com.edo.api.order.controller.OrderResult

interface OrderService {
    fun placeOrder(order: Order): OrderResult
}
