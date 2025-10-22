package com.designpatterns.patterns.dao.jpa;

import com.designpatterns.patterns.dao.User;
import com.designpatterns.patterns.dao.Dao;

import java.util.List;
import java.util.Optional;


public class JpaUserDao implements Dao<User> {

    public JpaUserDao() {
    }

    @Override
    public Optional<User> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user, String[] params) {

    }

    @Override
    public void delete(User user) {

    }
}
