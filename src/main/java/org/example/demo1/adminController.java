package org.example.demo1;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class adminController {
    @FXML
    private Button manageRoomsButton;

    @FXML
    private Button manageUsersButton;

    @FXML
    private Button viewBookingsButton;

    @FXML
    private Button myInfoButton;

    @FXML
    private Button logOutButton;


    @FXML
    private void initialize() {

        System.out.println("Customer Dashboard initialized");

        setupButtonHoverEffects();
    }

    private void setupButtonHoverEffects() {

        String originalStyle = "-fx-background-color:#1F3B73; -fx-background-radius: 5;";

        String hoverStyle = "-fx-background-color:#0A1A3F;  -fx-cursor: hand;";

        setButtonHoverEffect(manageRoomsButton, originalStyle, hoverStyle);
        setButtonHoverEffect(manageUsersButton, originalStyle, hoverStyle);
        setButtonHoverEffect(viewBookingsButton, originalStyle, hoverStyle);
        setButtonHoverEffect(myInfoButton, originalStyle, hoverStyle);
        setButtonHoverEffect(logOutButton, originalStyle, hoverStyle);
    }

    private void setButtonHoverEffect(Button button, String originalStyle, String hoverStyle) {
        button.setOnMouseEntered(e -> button.setStyle(hoverStyle));
        button.setOnMouseExited(e -> button.setStyle(originalStyle));
    }


    @FXML
    private void handlemanageRooms(ActionEvent event) {
        System.out.println("Manage Rooms clicked");
        try {
            navigateToScreen("ManageRooms.fxml", event, "Manage Rooms");
        } catch (IOException e) {

        }
    }


    @FXML
    private void handlemanageUsers(ActionEvent event) {
        System.out.println("Manage Users clicked");
        try {
            navigateToScreen("ManageUsers.fxml", event, "Manage Users");
        } catch (IOException e) {

        }
    }

    @FXML
    private void handleViewBookings(ActionEvent event) {
        System.out.println("View All Bookings clicked");
        try {
            navigateToScreen("ViewAllBookings.fxml", event, "All Bookings");
        } catch (IOException e) {

        }
    }

    @FXML
    private void handlemyInfo(ActionEvent event) {
        System.out.println("My Info clicked");
        try {
            navigateToScreen("MyInfo.fxml", event, "My Info");
        } catch (IOException e) {

        }
    }

    @FXML
    private void handleLogOut(ActionEvent event) {
        try {
            navigateToScreen("login.fxml", event, "Login");
        } catch (IOException e) {

        }
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
