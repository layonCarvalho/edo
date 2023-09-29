package com.edo.api.service.product

import com.edo.api.entities.product.Product
import java.util.*

interface ProductService {
    fun create(product: Product): Product

    fun getAll(): List<Product>

    fun getById(id: Long): Optional<Product>

    fun update(id: Long, product: Product): Optional<Product>

    fun delete(id: Long)

    fun updateProduct(product: Product): Product
    fun getProductById(productId: Long): Product

}