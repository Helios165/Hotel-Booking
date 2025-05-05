package org.example.demo1;


import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController {



    Stage Stage = new Stage();
    @FXML
    public Button backFromLoginBtn;


    @FXML
    private Button doLoginBtn;

    @FXML
    private StackPane loginPane;

    @FXML
    private PasswordField loginPasswordField;

    @FXML
    private TextField loginUsernameField;



    public void onBackFromLogin(ActionEvent event) throws IOException {

        navigateToScreen("welcome.fxml", event, "...");
    }

    public void onDoLogin(ActionEvent event) throws IOException {


        // change the destination to the next scene
        navigateToScreen("customer2.fxml", event, "...");

    }




    private void navigateToScreen(String fxmlFile, ActionEvent event, String title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }


}
