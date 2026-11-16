package service;

import dao.UserDAOInterface;
import model.User;

public class AuthService {

    private UserDAOInterface userDAO;

    // Test account already uses ID 1,
    // so new accounts start at ID 2
    private int nextUserId = 2;

    public AuthService(UserDAOInterface userDAO) {
        this.userDAO = userDAO;
    }

    // Logs a user in
    public boolean authenticate(String email, String password) {

        User user =
                userDAO.findByEmail(email);

        if (
                user != null
                        &&
                user.getPassword().equals(password)
        ) {

            return true;
        }

        return false;
    }

    // Creates a new user account
    public boolean register(
            String name,
            String email,
            String password
    ) {

        // Do not allow duplicate email addresses
        if (userDAO.findByEmail(email) != null) {

            return false;
        }

        User newUser =
                new User(
                        nextUserId,
                        name,
                        email,
                        password
                );

        boolean accountCreated =
                userDAO.addUser(newUser);

        if (accountCreated) {

            nextUserId++;
        }

        return accountCreated;
    }
}