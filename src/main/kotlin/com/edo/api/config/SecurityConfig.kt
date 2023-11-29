package com.edo.api.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
//class SecurityConfig(private val userService: UserService) : WebSecurityConfigurerAdapter() {
class SecurityConfig() : WebSecurityConfigurerAdapter() {


    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.csrf().disable();
        /*
        http.authorizeRequests()
            .antMatchers("/api").permitAll() // Permitindo registro
            .anyRequest().authenticated() // Todas as outras requisições precisam autenticação
            .and()
            .httpBasic() // Usando autenticação básica
            .and()
            .csrf().disable() // Desabilitando proteção CSRF

         */
    }
}
