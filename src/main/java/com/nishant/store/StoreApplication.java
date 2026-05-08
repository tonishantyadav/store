package com.nishant.store;

import com.nishant.store.entities.Address;
import com.nishant.store.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {
    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        User user = User.builder()
                .name("John Smith")
                .email("johnsmith@domain.com")
                .password("password")
                .build();
        System.out.println(user);

        Address address = Address.builder()
                .street("ABC")
                .city("DEF")
                .state("X")
                .build();

        user.addAddress(address);
        System.out.println(user);
    }
}
