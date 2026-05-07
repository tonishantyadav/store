package com.nishant.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Builder
@ToString
@AllArgsConstructor // Custom constructor, Will not generate the default constructor
@NoArgsConstructor //  Generate the default constructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;
}
