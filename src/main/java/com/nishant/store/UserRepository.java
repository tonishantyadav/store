package com.nishant.store;

import org.springframework.stereotype.Service;

@Service
public interface UserRepository {
    public void save(User user);
}
