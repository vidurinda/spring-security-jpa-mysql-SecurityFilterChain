package com.ices.auth;

import com.ices.auth.model.Role;
import com.ices.auth.model.User;
import com.ices.auth.repository.RoleRepository;
import com.ices.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collections;
import java.util.Set;

@SpringBootApplication
public class IcesAuthServiceApplication {

    @Autowired
    private PasswordEncoder encoder;

    public static void main(String[] args) {
        SpringApplication.run(IcesAuthServiceApplication.class, args);
    }



    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, RoleRepository roleRepository) {
        return args -> {
//            roleRepository.save(Role.builder().name("ROLE_ADMIN").build());
//            roleRepository.save(Role.builder().name("ROLE_USER").build());

//            userRepository.save(User.builder().userName("admin")
//                    .password(encoder.encode("admin"))
//                    .firstName("test").lastName("test").email("admin@test.com")
//                    .statusActive(true)
//                    .userRoles(Set.of(roleRepository.findById(2).get()))
//                    .build());
//            userRepository.save(User.builder().userName("user")
//                    .password(encoder.encode("user"))
//                    .firstName("test").lastName("test").email("user@test.com")
//                    .statusActive(true)
//                    .userRoles(Set.of(roleRepository.findById(3).get()))
//                    .build());
        };
    }

}
