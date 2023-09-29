package com.edo.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
//@EnableWebMvc
@ComponentScan(value = ["com.edo.api"])
@EntityScan(basePackages = ["com.edo.api.repository.domain"])
@EnableJpaRepositories(basePackages = ["com.edo.api.repository.repository"])
class EdoApiApplication
fun main(args: Array<String>)
{


	runApplication<EdoApiApplication>(*args)
}
