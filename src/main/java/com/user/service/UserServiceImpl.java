package com.user.service;

import com.user.entity.User;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    List<User> list = Arrays.asList(new User(2411L, "Thanush", "23525625"), new User(2412L, "Abhishek", "99999"),
            new User(2413L, "Karthik", "888"));

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

    @Override
    public List<User> getUsers() {
        return list;
    }
}
