package com.edo.api.service

import com.edo.api.entites.user.User

interface UserService {

    fun createUser(username: String, password: String)

    fun getUserByUsername(username: String): User
}