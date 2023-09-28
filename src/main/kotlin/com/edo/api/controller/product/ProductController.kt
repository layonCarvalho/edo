<<<<<<< HEAD:src/main/kotlin/com/edo/api/product/controller/ProductController.kt
package com.edo.api.product.controller

import com.edo.api.product.entities.Product
import com.edo.api.service.ProductService
=======
package com.edo.api.controller.controller.product

import com.edo.api.product.entities.Product
import com.edo.api.product.service.ProductService
>>>>>>> 03033b46db96af684443b670fe0642a82eb2f5fe:src/main/kotlin/com/edo/api/controller/product/ProductController.kt
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
class ProductController(private val service: ProductService) {

    @PostMapping
    fun create(@RequestBody product: Product): Product = service.create(product)

    @GetMapping
    fun getAll(): List<Product> = service.getAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<Product> =
            service.getById(id).map {
                ResponseEntity.ok(it)
            }.orElse(ResponseEntity.notFound().build())

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody product: Product): ResponseEntity<Product> =
            service.update(id, product).map {
                ResponseEntity.ok(it)
            }.orElse(ResponseEntity.notFound().build())

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        service.delete(id)
        return ResponseEntity.ok().build()
    }



}
