package com.nishant.store;

import com.nishant.store.entities.Category;
import com.nishant.store.entities.Product;
import com.nishant.store.entities.Profile;
import com.nishant.store.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {
    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        Category category = Category.builder()
                .name("Clothing")
                .build();

        Product product = Product.builder()
                .name("H&M")
                .price(BigDecimal.valueOf(100.2))
                .build();

        category.addProduct(product);
        System.out.println(category);
    }
}
