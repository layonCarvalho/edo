package com.edo.api.repository.repository.stock

import com.edo.api.repository.domain.stock.Stock
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface StockRepository : JpaRepository<Stock, Long> {

    }
