package com.edo.api.service

import com.edo.api.entities.user.Product
import java.util.*

interface ProductService {
    fun create(product: Product): Product

    fun getAll(): List<Product>

    fun getById(id: Long): Optional<Product>

    fun update(id: Long, product: Product): Optional<Product>

    fun delete(id: Long)

    //fun getProductById(id: Long): Optional<Product>

    fun updateProduct(product: Product): Product




}

