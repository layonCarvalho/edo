package com.edo.api.repository.order


import com.edo.api.entities.order.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Long>
