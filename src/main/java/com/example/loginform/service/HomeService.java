package com.example.loginform.service;

import com.example.loginform.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<User> getUsers(){

        List<User> userList = new ArrayList<>();

        User user1 = new User(1, "http://www.pngall.com/wp-content/uploads/5/User-Profile-PNG-High-Quality-Image.png", "User1", "any text");
        User user2 = new User(2, "http://www.pngall.com/wp-content/uploads/5/User-Profile-PNG-High-Quality-Image.png", "User2", "any text for user2");

        userList.add(user1);
        userList.add(user2);


        return userList;
    }

    public List<User> loginUsers(String loginName, String description){

        List<User> userList = new ArrayList<>();

        User user1 = new User(1, "http://www.pngall.com/wp-content/uploads/5/User-Profile-PNG-High-Quality-Image.png", loginName, description);

        userList.add(user1);

        return userList;
    }
 }
