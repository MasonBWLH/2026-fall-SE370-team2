import controller.LoginController;
import dao.UserDAO;
import service.AuthService;
import view.LoginPage;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            UserDAO userDAO = new UserDAO();

            AuthService authService =
                    new AuthService(userDAO);

            LoginController loginController =
                    new LoginController(authService);

            LoginPage loginPage =
                    new LoginPage(loginController);

            loginPage.setVisible(true);
        });
    }
}