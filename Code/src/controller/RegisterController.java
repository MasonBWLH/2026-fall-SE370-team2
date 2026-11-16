package controller;

import service.AuthService;

// Handles create-account requests from the user interface
public class RegisterController {

    private AuthService authService;

    public RegisterController(
            AuthService authService
    ) {

        this.authService = authService;
    }

    // Attempts to create a new user account
    public boolean register(
            String name,
            String email,
            String password
    ) {

        return authService.register(
                name,
                email,
                password
        );
    }
}