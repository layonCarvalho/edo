package com.edo.api.repository

import com.edo.api.entities.user.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Long>
