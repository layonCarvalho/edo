package com.edo.api.service.user

import com.edo.api.repository.domain.user.User
import com.edo.api.repository.repository.user.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(private val userRepository: UserRepository): UserService {

    val LOG = LoggerFactory.getLogger(UserServiceImpl::class.java)


    override fun createUser(username: String, password: String) {
        runCatching {
            LOG.info("START createUser user: {}", username)

            val user = User(username = username, password = password)
            userRepository.save(user)

        }.onFailure {
            LOG.info("ERROR createUser user: {} message: {} localizedMessage: {}", username, it.message, it.localizedMessage)

            throw it
        }.onSuccess {
            LOG.info("END createUser user: {}", username)
        }
    }

    override fun getUserByUsername(username: String): List<User> {

        var response = Collections.emptyList<User>()

        runCatching {
        LOG.info("START getUserByUsername user: {}", username)

        response =  userRepository.findByUsername(username)
        }.onFailure {

        LOG.info("ERROR getUserByUsername user: {} message: {} localizedMessage: {}", username, it.message, it.localizedMessage)
        throw it
        }.onSuccess {
            LOG.info("END getUserByUsername user: {}", username)
        }

        return response
    }
}


