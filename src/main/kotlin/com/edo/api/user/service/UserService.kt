package com.edo.api.service

import com.edo.api.entites.user.User

open class UserService {
    interface UserServiceUserService {

    fun createUser(username: String, password: String)

    fun getUserByUsername(username: String): User
}

    open fun createUser(username: String, password: String) {}
    open fun getUserByUsername(username: String): User {
        TODO("Not yet implemented")
    }
}


