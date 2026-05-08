package com.nishant.store;

import com.nishant.store.entities.Address;
import com.nishant.store.entities.Tag;
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

        Address address = Address.builder()
                .street("ABC")
                .city("DEF")
                .state("X")
                .build();

        Tag tag = new Tag();
        tag.setName("ABC");

        user.addTag(tag);
        System.out.println(user);
    }
}
