package com.example.admin.Configuration;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;


import com.example.admin.Security.ApiAuthenticationFilter;
import com.example.admin.Service.CustomUserDetailsService;
@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	 @Autowired
	    ApiAuthenticationFilter apiAuthenticationFilter;
	    
	    @Autowired
	    CustomUserDetailsService customUserDetailsService;
   
    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
      
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(c -> c.disable())
            .authorizeHttpRequests(request -> request
                .requestMatchers("/api/user/register","/api/user/login", "/css/**", "/js/**").permitAll() 
                .anyRequest().authenticated());
        http.addFilterBefore(apiAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

           
        return http.build();
    }    
    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
    }
}