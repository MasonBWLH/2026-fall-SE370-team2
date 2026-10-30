package service;

import dao.UserDAOInterface;
import model.User;

//handles login authentication

public class AuthService {

    private UserDAOInterface userDAO;

    public AuthService(UserDAOInterface userDAO) {
        this.userDAO = userDAO;
    }

    // authenticates a user by email and password
    public boolean authenticate(String email, String password) {
        User user = userDAO.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}