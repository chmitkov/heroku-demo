package com.ch.demo.service;

import java.util.List;

public interface UserService {
    void addUser(String username);

    List<String> findAllUser();
}
