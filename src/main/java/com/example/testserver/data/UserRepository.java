package com.example.testserver.data;
import com.example.testserver.User;

import java.util.Optional;

public interface UserRepository {
    Iterable<User> findAll();
    Optional<User> findByID(Long id);
    User save(User user);

}
