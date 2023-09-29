package com.edo.api.service.user

import com.edo.api.repository.user.UserRepository
import com.edo.api.entities.user.User
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository): UserService {

    override fun createUser(username: String, password: String) {
        val user = User(username = username, password = password)
        userRepository.save(user)
    }

    override fun getUserByUsername(username: String): User? {
        return userRepository.findByUsername(username)
    }
}


