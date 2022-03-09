package org.example.presentation;

import org.example.service.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    @Test
    void register() {
        // GIVEN
        UserService userService = mock(UserService.class);
        void UserController(userService);


        UserController userController = new UserController(userService);

        String userName = "Márton";

        // WHEN
        userController.register(userName);

        //THEN
        verify(userService, times(1).save(ArgumentMatchers.<User>any()));
    }
}