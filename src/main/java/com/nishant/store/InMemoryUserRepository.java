package com.nishant.store;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryUserRepository implements  UserRepository{
    public void save(User user) {
        System.out.println("Saving the user: ");
        System.out.println(user);
    }
}
