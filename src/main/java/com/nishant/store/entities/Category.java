package com.nishant.store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "categories")
public class Category {
    @Column(name = "id")
    private Byte id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category")
    @Builder.Default
    private HashSet<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        products.add(product);
        product.setCategory(this);
    }

    public void removProduct(Product product) {
        products.remove(product);
        product.setCategory(null);
    }
}
