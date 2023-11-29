package com.edo.api.service.product

import com.edo.api.repository.domain.product.Product
import java.util.*

interface ProductService {
    fun createProduct(name: String, description: String, price: Double, quantityAvailable: Int)

    fun getAll(): List<Product>

    fun getById(id: Long): Optional<Product>

    fun update(id: Long, product: Product): Optional<Product>

    fun delete(id: Long)

    fun updateProduct(product: Product): Product
    fun getProductById(productId: Long): Product

}