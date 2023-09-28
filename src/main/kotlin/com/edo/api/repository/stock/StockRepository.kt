package com.edo.api.repository.repository.stock

import com.edo.api.entities.stock.Stock
import org.springframework.data.jpa.repository.JpaRepository

interface StockRepository : JpaRepository<Stock, Long> {

    }
