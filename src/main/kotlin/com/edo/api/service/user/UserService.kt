package com.edo.api.user.service

import com.edo.api.user.entities.User
import com.edo.api.user.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun createUser(username: String, password: String) {
        val user = User(username = username, password = password)
        userRepository.save(user)
    }

    fun getUserByUsername(username: String): User? {
        return userRepository.findByUsername(username)
    }
}
