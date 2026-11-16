package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

// Handles access to user account data
public class UserDAO implements UserDAOInterface {

    private List<User> users;

    public UserDAO() {

        users = new ArrayList<>();

        // Temporary test account
        users.add(
                new User(
                        1,
                        "Test User",
                        "test@email.com",
                        "password123"
                )
        );
    }

    // Finds a user using their email address
    @Override
    public User findByEmail(String email) {

        for (User user : users) {

            if (
                    user.getEmail()
                            .equalsIgnoreCase(email)
            ) {

                return user;
            }
        }

        return null;
    }

    // Adds a new user account
    @Override
    public boolean addUser(User user) {

        // Do not allow duplicate emails
        if (
                findByEmail(user.getEmail())
                        != null
        ) {

            return false;
        }

        users.add(user);

        return true;
    }
}