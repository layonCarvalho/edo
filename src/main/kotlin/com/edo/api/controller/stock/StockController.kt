package com.edo.api.stock.controller

import com.edo.api.stock.entities.Stock
import com.edo.api.stock.service.StockService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/stock")
class StockController (private val service: StockService) {

    @PostMapping
    fun create(@RequestBody stock: Stock): Stock = service.create(stock)

    @GetMapping
    fun getAll(): List<Stock> = service.getAll()

    @GetMapping("/{id}")
    fun getbyId(@PathVariable id: Long): ResponseEntity<Stock> =
            service.getbyId(id).map {
                ResponseEntity.ok(it)
            }.orElse(ResponseEntity.notFound().build())

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody stock: Stock): ResponseEntity<Stock> =
            service.update(id, stock).map {
                ResponseEntity.ok(it)
            }.orElse(ResponseEntity.notFound().build())


    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        service.delete(id)
        return ResponseEntity<Void>(HttpStatus.OK)
    }

}





//{
//val stockOptional = repository.findById(id)
//if (stockOptional.isPresent) {


//fun delete(@PathVariable id: Long): ResponseEntity<Void> =
//        repository.findById(id).map {
//            repository.delete(it)
//            return ResponseEntity<Void>(HttpStatus.OK)
//        } else {
//    return ResponseEntity.notFound().build()
//}
//}

//val existingStockOptional = repository.findById(id)

//return existingStockOptional.map { existingStock ->

// val updatedStock = it.copy(
//  name = stock.name,
//  price = stock.price,
//  amount = stock.amount
//)
//val savedStock = repository.save(updatedStock)