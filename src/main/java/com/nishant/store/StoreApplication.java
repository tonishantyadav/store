package com.nishant.store;

import com.nishant.store.entities.Profile;
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

        Profile profile = Profile.builder()
                .bio("Hi")
                .dateOfBirth("24-08-2024")
                .phoneNumber("1234567890")
                .loyaltyPoints(12)
                .build();

        user.setProfile(profile);
        System.out.println(user);
    }
}
