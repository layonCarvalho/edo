package com.edo.api.config
/*
import com.edo.api.service.UserService
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UsernameNotFoundException

@Configuration
@EnableWebSecurity
class SecurityConfig(private val userService: UserService) : WebSecurityConfigurerAdapter() {

    @Throws(Exception::class)
    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.userDetailsService { username->
            val user = userService.getUserByUsername(username)
            user?.let{User (user.username, user.password, ArrayList()) // Criando UserDetails
            } ?: throw UsernameNotFoundException("User not found: $username")
        }
    }

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.authorizeRequests()
            .antMatchers("/api/register").permitAll() // Permitindo registro
            .anyRequest().authenticated() // Todas as outras requisições precisam autenticação
            .and()
            .httpBasic() // Usando autenticação básica
            .and()
            .csrf().disable() // Desabilitando proteção CSRF
    }
*/
