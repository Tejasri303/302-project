package WisdomBites.controller;

import WisdomBites.Main.HelloApplication;
import WisdomBites.model.UserDao;
import WisdomBites.model.User;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.scene.layout.StackPane;


public class LoginRegisterController {

    @FXML private TextField loginEmailField;
    @FXML private TextField loginPassWordField;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;

    @FXML private TextField registerEmailField;
    @FXML private TextField registerPassWordField;

    @FXML private VBox loginPane;
    @FXML private VBox registerPane;


    @FXML
    public void loginButtonHandle() {
        String email = loginEmailField.getText();
        String passWord = loginPassWordField.getText();

        User user = UserDao.login(email, passWord);
        StateController.setCurrentUser(user);

        if(user != null) {
            System.out.println(user.getFirstName());
            System.out.println("Successful!");
        } else {
            System.out.println("unsuccessful");
        }
    }

    @FXML
    public void registerButtonHandle() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = registerEmailField.getText();
        String passWord = registerPassWordField.getText();

        boolean registrationSuccessful = UserDao.registerUser(firstName, lastName, email, passWord);

        if(registrationSuccessful) {
            System.out.println("Successful!");
        } else {
            System.out.println("unsuccessful");
        }
    }

    //tariq is cool

    @FXML
    public void initialize() {
        toggleThumb.setTranslateX(-15); // move left initially
    }

    @FXML
    private void flipCard() {
        isLogin = !isLogin;

        loginPane.setVisible(isLogin);
        registerPane.setVisible(!isLogin);

        System.out.println(StateController.currentUser.getFirstName());

        TranslateTransition slide = new TranslateTransition(Duration.millis(200), toggleThumb);
        slide.setToX(isLogin ? -15 : 15); // slide left or right
        slide.play();
    }

    @FXML private StackPane toggleSwitch;
    @FXML private Circle toggleThumb;

    private boolean isLogin = true;

}
