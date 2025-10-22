package com.designpatterns.patterns.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserDao implements Dao<User> {

    List<User> userList = new ArrayList<>();

    public UserDao() {
        userList.add(new User("Nico", "nico.s@ex.com"));
        userList.add(new User("Luca", "luca.m.z@ex.com"));
    }

    @Override
    public Optional<User> getById(long id) {
        return Optional.ofNullable(userList.get((int) id));
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public void save(User user) {
        userList.add(user);
    }

    @Override
    public void update(User user, String[] params) {
        user.setName(Objects.requireNonNull(params[0], "Name cannot be null"));
        user.setEmail(Objects.requireNonNull(params[1], "Email cannot be null"));

        userList.add(user);
    }

    @Override
    public void delete(User user) {
        userList.remove(user);
    }
}
