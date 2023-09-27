package com.edo.api.repository

import com.edo.api.entites.user.Stock
import org.springframework.data.jpa.repository.JpaRepository

interface StockRepository : JpaRepository<Stock, Long> {

    }
