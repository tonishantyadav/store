package com.nishant.store;

import com.nishant.store.entities.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {
    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        User user = User.builder()
                .name("John Smith")
                .email("johnsmith@domain.com")
                .password("johnsmith")
                .build();

        Address address = Address.builder()
                .street("XYZ")
                .city("ABC")
                .state("KA")
                .build();

        Tag tag = Tag.builder()
                .name("Student")
                .build();

        Category category = Category.builder()
                .name("Clothing")
                .build();

        Product product = Product.builder()
                .name("H&M")
                .price(BigDecimal.valueOf(100.2))
                .build();

        user.addAddress(address);
        user.addTag(tag);

        category.addProduct(product);

        user.addToWishList(product);

        System.out.println(user);
    }
}
