package com.RichemeVyas.Services;

import com.RichemeVyas.Domain.User;
import com.RichemeVyas.Domain.Users;

public class RegistrationService {
    public String addNewUser(User newUser){
        return Users.registerUser(newUser);
    }
}
