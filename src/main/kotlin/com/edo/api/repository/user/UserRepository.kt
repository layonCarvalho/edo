package com.edo.api.repository.user

import com.edo.api.entities.user.User
import org.springframework.data.jpa.repository.JpaRepository


interface UserRepository : JpaRepository<User, Long>{

    fun findByUsername(name: String): User

}


