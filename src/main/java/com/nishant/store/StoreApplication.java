package com.nishant.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        User user = new User();
//        user.setId(1);
//        user.setEmail("test@domain.com");
//        user.setPassword("1234");
//        user.setName("John Smith");
//
//        UserService userService = context.getBean(UserService.class);
//        userService.registerUser(user);
    }
}
