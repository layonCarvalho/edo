package com.edo.api.service.product

import com.edo.api.repository.domain.product.Product
import com.edo.api.repository.repository.product.ProductRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(private val productRepository: ProductRepository) : ProductService {


    val LOG = LoggerFactory.getLogger(ProductServiceImpl::class.java)


    override fun createProduct (name: String, description: String, price: Double, quantityAvailable: Int) {
        runCatching {
            LOG.info("START createProduct product: {}", name)

            val product = Product (name = name, description = description, price = price, quantityAvailable = quantityAvailable )
            productRepository.save(product)

        }.onFailure {
            LOG.info("ERROR createProduct product: {} message: {} localizedMessage: {}", name, it.message, it.localizedMessage)

            throw it
        }.onSuccess {
            LOG.info("END createProduct product: {}", name)
        }
    }


    override fun getAll(): List<Product> {
        return productRepository.findAll()
    }

    override fun getById(id: Long): Optional<Product> {
        return productRepository.findById(id)
    }

    override fun update(id: Long, product: Product): Optional<Product> {
        /*
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

         */

        return Optional.ofNullable(null)
    }

    override fun delete(id: Long) {
        //repository.findById(id).ifPresent { repository.delete(it) }
    }

    override fun getProductById(id: Long): Product {
        return productRepository.findById(id).orElse(null)
    }


    override fun updateProduct(product: Product): Product {
        return productRepository.save(product)
    }



}