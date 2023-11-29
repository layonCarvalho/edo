
package com.edo.api.controller.product

import com.edo.api.repository.domain.product.Product
import com.edo.api.service.product.ProductService
import org.springframework.http.HttpStatus

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
class ProductController(private val productService: ProductService) {

    @PostMapping
    fun createProduct(@RequestHeader name: String, @RequestHeader description: String, @RequestHeader price: Double, @RequestHeader quantityAvailable: Int): ResponseEntity<String> {
        productService.createProduct(name, description, price, quantityAvailable)
        return ResponseEntity.status(HttpStatus.CREATED).body("Product created successfully")
    }




    @GetMapping
    fun getAll(): List<Product> = productService.getAll()
/*
    @GetMapping("/{id}")
    productService.getById(id).map {
                ResponseEntity.ok(it)
            }.orElse(ResponseEntity.notFound().build())



 */
    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody product: Product): ResponseEntity<Product> =
        productService.update(id, product).map {
                ResponseEntity.ok(it)
            }.orElse(ResponseEntity.notFound().build())

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        productService.delete(id)
        return ResponseEntity.ok().build()
    }



}
