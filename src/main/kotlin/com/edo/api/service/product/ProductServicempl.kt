package com.edo.api.product.service

import com.edo.api.product.entities.Product
<<<<<<< HEAD:src/main/kotlin/com/edo/api/product/service/ProductServicempl.kt
import com.edo.api.repository.ProductRepository
import com.edo.api.service.ProductService
=======
import com.edo.api.product.repository.ProductRepository
>>>>>>> 03033b46db96af684443b670fe0642a82eb2f5fe:src/main/kotlin/com/edo/api/service/product/ProductServicempl.kt
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

    override fun getProductById(productId: Long): Any {
        TODO("Not yet implemented")
    }


}