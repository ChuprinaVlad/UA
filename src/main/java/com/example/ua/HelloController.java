package com.example.ua;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AuthSignInButton;

    @FXML
    private Button LoginSignUpButton;

    @FXML
    private TextField Login_field;

    @FXML
    private PasswordField Password_field;


    @FXML
    void initialize() {
        AuthSignInButton.setOnAction( event -> {
            System.out.println("Кнопка для входу!!!");
        });
    }
}