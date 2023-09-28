package com.edo.api.user.controller

import com.edo.api.user.entities.User
import com.edo.api.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController(private val userService: UserService) {

    @PostMapping("/create")
    fun createUser(@RequestParam username: String, @RequestParam password: String): ResponseEntity<String> {
        userService.createUser(username, password)
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully")
    }

    @GetMapping("/{username}")
    fun getUserByUsername(@PathVariable username: String): ResponseEntity<User> {
        val user = userService.getUserByUsername(username)
        return ResponseEntity.ok(user)
    }
}
