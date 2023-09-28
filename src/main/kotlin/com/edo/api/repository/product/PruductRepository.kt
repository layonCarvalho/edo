package com.edo.api.repository.repository.product

import com.edo.api.entities.product.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long>