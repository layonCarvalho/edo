package com.edo.api.service

import com.edo.api.entities.user.Order
import com.edo.api.entities.user.OrderResult

interface OrderService {
    fun placeOrder(order: Order): OrderResult
}
