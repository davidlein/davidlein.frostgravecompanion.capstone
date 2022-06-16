package com.davidlein.frostgravecompanion.security;

import com.davidlein.frostgravecompanion.services.WizardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig
{

    @Bean
    public UserDetailsService userDetailsService()
    {
        return new WizardService();
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public DaoAuthenticationProvider authenticationProvider()
    {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());

        return authenticationProvider;
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() throws Exception
    {
        return (web) -> web.ignoring().antMatchers("/images/**", "/js/**","/webjars/**");
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
    {
        http.authorizeRequests()
                .antMatchers("/warband","/base_vault","/warband_creator","/venture_forth").authenticated()
                .anyRequest().permitAll()
                .and()
                .formLogin().usernameParameter("email").defaultSuccessUrl("/warband").permitAll().loginPage("/home")
                .loginProcessingUrl("/doLogin")
                .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/").permitAll();
        return http.build();
    }
}
