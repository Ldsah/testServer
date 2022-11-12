package com.example.testserver.data;

import com.example.testserver.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

@Repository
public class JdbcUserRepository implements UserRepository{
    private JdbcTemplate jdbcTemplate;
    public JdbcUserRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public Iterable<User> findAll() {
        return jdbcTemplate.query(
                "select id, name, phone, email, gender, age, login, password",
                this::mapRowToUser);
        )
    }

//    private User mapRowToUser(ResultSet row, int rowNum) throws SQLException {
//
//
//
//    }


    @Override
    public Optional<User> findByID(Long id) {
        return Optional.empty();
    }

    @Override
    public User save(User user) {
        return null;
    }
}
