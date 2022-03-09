package org.example.presentation;

import org.example.service.User;
import org.example.service.UserService;

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public boolean register(String name) {
        if (name.length() > 6 && !name.contains(" ")) {
            userService.save(new User());
            return true;
        } else {
            return false;
        }
    }
}
