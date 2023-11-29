package com.edo.api.repository.repository.product

import com.edo.api.repository.domain.product.Product
import com.edo.api.repository.domain.user.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<Product, Long>{

fun getById(name: String): List<Product>

}