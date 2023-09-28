package com.edo.api.order.repository

import com.edo.api.order.entities.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Long>
