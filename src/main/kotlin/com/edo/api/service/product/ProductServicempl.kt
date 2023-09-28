package com.edo.api.product.service

import com.edo.api.product.entities.Product
import com.edo.api.product.repository.ProductRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(private val repository: ProductRepository) : ProductService {
    override fun create(product: Product): Product {
        return repository.save(product)
    }

    override fun getAll(): List<Product> {
        return repository.findAll()
    }

    override fun getById(id: Long): Optional<Product> {
        return repository.findById(id)
    }

    override fun update(id: Long, product: Product): Optional<Product> {
        val optional = getById(id)
        if (!optional.isPresent) {
            return Optional.empty()
        }

        return optional.map {
            val productToUpdate = it.copy(
                    name = product.name,
                    description = product.description,
                    price = product.price
            )

            repository.save(productToUpdate)
        }
    }

    override fun delete(id: Long) {
        repository.findById(id).ifPresent { repository.delete(it) }
    }

    override fun getProductById(id: Long): Optional<Product> {
        return repository.findById(id)
    }


    override fun updateProduct(product: Product): Product {
        return repository.save(product)
    }


}