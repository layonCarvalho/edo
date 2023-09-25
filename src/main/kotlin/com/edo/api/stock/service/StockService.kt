package com.edo.api.service


import com.edo.api.entites.user.Stock
import java.util.*


interface StockService {
    fun create(stock: Stock): Stock

    fun getAll(): List<Stock>

    fun getbyId(id:Long): Optional<Stock>

    fun update(id: Long, stock: Stock): Optional<Stock>

    fun delete(id: Long)
}