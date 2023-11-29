package com.edo.api.controller.user

import com.edo.api.repository.domain.user.User
import com.edo.api.service.user.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
//@ApiOperation(tags = ["Domain CRUD"], value = "Layer responsible to recevie request to manager Create/Read/Update/Delete the Domain entity")
class UserController(private val userService: UserService) {

    @PostMapping("/create")
    //TODO - MUDAR PARA @RequestBody
    fun createUser(@RequestHeader username: String, @RequestHeader password: String): ResponseEntity<String> {
        userService.createUser(username, password)
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully")
    }

    @GetMapping("/find")
    fun getUserByUsername(@RequestHeader username: String): ResponseEntity<List<User>> {
        val user = userService.getUserByUsername(username)
        return ResponseEntity.ok(user)
    }
}
