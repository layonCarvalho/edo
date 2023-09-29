package com.edo.api.repository.repository.user

import com.edo.api.repository.domain.user.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface UserRepository : JpaRepository<User, Long>{

    fun findByUsername(name: String): User

}


