package com.edo.api.service.user

import com.edo.api.repository.domain.user.User
import org.springframework.stereotype.Service

@Service
interface UserService {
    fun createUser(username: String, password: String)

    fun getUserByUsername(username: String): List<User>


}
