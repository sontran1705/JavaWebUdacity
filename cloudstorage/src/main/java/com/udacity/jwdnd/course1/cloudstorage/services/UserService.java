package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.entity.Users;
import com.udacity.jwdnd.course1.cloudstorage.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Base64;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final HashService hashService;

    public UserService(UserMapper userMapper, HashService hashService) {
        this.userMapper = userMapper;
        this.hashService = hashService;
    }

    public boolean isUsernameAvailable(String username){
        return userMapper.getUser(username) == null;
    }

    public int createUser(Users users){
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt);
        String encodedSalt = Base64.getEncoder().encodeToString(salt);
        String hashedPasswword = hashService.getHashedValue(users.getPassWord(), encodedSalt);
        return userMapper.insert(new Users(null, users.getUserName(), encodedSalt, hashedPasswword, users.getFirstName(), users.getLastName()));
    }

    public Users getUser(String username){
        return userMapper.getUser(username);
    }

    public int getUserIdByUsername(String userName){
        Integer userIdGot =  userMapper.getByUserId(userName);
        if(userIdGot == null){
            return 0;
        }
        return userIdGot;
    }
}
