package com.edo.api.service

import com.edo.api.entites.user.Stock
import com.edo.api.repository.StockRepository
import org.springframework.stereotype.Service
import java.lang.RuntimeException
import java.util.*

@Service
class StockServiceImpl(private val repository: StockRepository) : StockService{
    override fun create(stock: Stock): Stock {
        return repository.save(stock)
    }

    override fun getAll(): List<Stock> {
        return repository.findAll()
    }

    override fun getbyId(id: Long): Optional<Stock> {
        return repository.findById(id)
    }

    override fun update(id: Long, stock: Stock): Optional<Stock> {
        val optional = getbyId(id)
        if (optional.isPresent) Optional.empty<Stock>()

        return optional.map {
            val stockToUpdate = it.copy(
                    name = stock.name,
                    price = stock.price,
                    amount = stock.amount
            )

            repository.save(stockToUpdate)
        }

    }

    override fun delete(id: Long) {
        repository.findById(id).map {
            repository.delete(it)
        }.orElse(throw RuntimeException("Id not found $id"))
    }

}
