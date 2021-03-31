package com.ch.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

//    private final UserRepository userRepository;
//
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @Override
    public void addUser(String username) {
//        UserEntity userEntity = new UserEntity()
//                .setUsername(username);
//
//        userRepository.save(userEntity);
    }

    @Override
    public List<String> findAllUser() {
//        return userRepository.findAllUsernames();
        return null;
    }
}
