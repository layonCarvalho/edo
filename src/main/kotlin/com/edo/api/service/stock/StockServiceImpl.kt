package com.edo.api.stock.service

import com.edo.api.repository.domain.stock.Stock
import com.edo.api.repository.repository.stock.StockRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class StockServiceImpl(private val repository: StockRepository) : StockService {
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
        /*
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

         */

        return Optional.ofNullable(null)

    }

    override fun delete(id: Long) {
        repository.findById(id).map {
            repository.delete(it)
        }.orElse(throw RuntimeException("Id not found $id"))
    }

}
