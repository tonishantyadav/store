package com.nishant.store;

import com.nishant.store.entities.*;
import com.nishant.store.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

@SpringBootApplication
public class StoreApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);

        User user = User.builder()
                .name("John Smith")
                .email("john.smith@domain.com")
                .password("john.smith@123")
                .build();

        userRepository.save(user);

        user = userRepository.findById(1L).orElseThrow(() -> new NoSuchElementException("User with the given id doesn't exists!"));
        System.out.println(user.getEmail());

    }
}
