/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.controller;

import com.vernanda.MainApp;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Developer
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnLogin;
    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnLoginOnAction(ActionEvent event) {
        if (txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            System.out.println("Isian masih kosong");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill all field");
            alert.showAndWait();
        } else if (txtUsername.getText().equals("1672001") && txtPassword.
                getText().equals("vernanda")) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.
                        setLocation(MainApp.class.
                                getResource("view/Menu.fxml"));
                BorderPane pane = loader.load();
                Scene s = new Scene(pane);
                //manggil form lain
                Stage secondStage = new Stage();
                secondStage.setScene(s);
                secondStage.setTitle("Main From");
                secondStage.show();
                //
                //close login stage
                borderPane.getScene().getWindow().hide();
                //
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid username or password");
            alert.showAndWait();
        }
    }

}
