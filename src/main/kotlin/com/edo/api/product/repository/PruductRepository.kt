package com.edo.api.repository

import com.edo.api.entities.user.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long>