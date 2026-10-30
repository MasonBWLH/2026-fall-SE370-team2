package dao;

import model.User;

//handles access to user data
public class UserDAO implements UserDAOInterface {
    // temporay for testing
    private User testUser;

     public UserDAO() {
        testUser = new User(
            1,
            "Test User",
            "test@email.com",
            "password123"
        );
    }

//searches for a user by email
@Override 
public User findByEmail(String email) {

    if(testUser.getEmail().equalsIgnoreCase(email)){
        return testUser;

        }
    return null;
    }
}

//temporary login : email: test@gmail.com, password: password123