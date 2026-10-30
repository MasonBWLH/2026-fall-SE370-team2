package controller;

import service.AuthService;

// handles login requests from the user interface
public class LoginController {
    
    private AuthService authService;

    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    // authenticates a user by email and password
    public boolean login(String email, String password) {
        return authService.authenticate(email, password);
    }
}