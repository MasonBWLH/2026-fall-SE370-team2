import controller.LoginController;
import controller.RegisterController;

import dao.UserDAO;

import service.AuthService;

import view.LoginPage;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(
            String[] args
    ) {

        SwingUtilities.invokeLater(
                () -> {

                    // One shared UserDAO
                    UserDAO userDAO =
                            new UserDAO();

                    // One shared authentication service
                    AuthService authService =
                            new AuthService(
                                    userDAO
                            );

                    // Login controller
                    LoginController loginController =
                            new LoginController(
                                    authService
                            );

                    // Registration controller
                    RegisterController registerController =
                            new RegisterController(
                                    authService
                            );

                    // Start application at login screen
                    LoginPage loginPage =
                            new LoginPage(
                                    loginController,
                                    registerController
                            );

                    loginPage.setVisible(
                            true
                    );
                }
        );
    }
}
// import view.UserProfileForm;

// import javax.swing.SwingUtilities;

// public class Main {

//     public static void main(String[] args) {

//         SwingUtilities.invokeLater(() -> {

//             // Temporary test user ID
//             UserProfileForm profileForm =
//                     new UserProfileForm(1);

//             profileForm.setVisible(true);
//         });
//     }
// }