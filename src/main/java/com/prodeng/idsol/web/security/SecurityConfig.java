package com.prodeng.idsol.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

        @Autowired
        private DataSource dataSource;

        @Autowired
        public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//            String encodedPasswd = bCryptPasswordEncoder.encode("password");
//            System.out.println(encodedPasswd);

            auth.jdbcAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                    .dataSource(dataSource)
                    .usersByUsernameQuery("select UserId, '$2a$10$hByud.WM.6JAOkMIcVdtIOFDahzzClM.XpY/EaJQN7Jg5amDdZ/u.','Y' from loginuser where UserId=?")
                    //.usersByUsernameQuery("select UserId, Password,'Y' from loginuser where UserId=?")
                    .authoritiesByUsernameQuery("select UserId, GroupCode from loginusergroup where UserId=?")
            ;
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {

            http.authorizeRequests()
                    .anyRequest().authenticated()
                    .and()
                    .formLogin().permitAll()
                    .and()
                    .logout().permitAll();
        }
}
