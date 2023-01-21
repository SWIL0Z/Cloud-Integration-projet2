package com.RichemeVyas.Domain;

import java.util.ArrayList;
import java.util.List;

public class Users {
    static private List<User> users = new ArrayList<>();

    static public String registerUser(User newUser){
        if (users.contains(newUser))
            return "This user already exists.";
        users.add(newUser);
        return "Registration successfull : " + newUser.toString() + " added.";
    }

    static public boolean exists(String userLogin){
        User u = new User(userLogin);
        return users.contains(u);
    }
}
