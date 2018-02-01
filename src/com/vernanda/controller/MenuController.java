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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Developer
 */
public class MenuController implements Initializable {

    @FXML
    private Button btnA;
    @FXML
    private Button btnB;
    @FXML
    private Button btnC;
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
    private void btnAOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.
                    setLocation(MainApp.class.
                            getResource("view/FromA.fxml"));
            AnchorPane pane = loader.load();
            Scene s = new Scene(pane);
            Stage stageA = new Stage();
            stageA.setScene(s);
            stageA.setTitle("Form A");
            stageA.initOwner(borderPane.getScene().getWindow());
            stageA.initModality(Modality.APPLICATION_MODAL);
            stageA.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnBOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.
                    setLocation(MainApp.class.
                            getResource("view/FormB.fxml"));
            BorderPane pane = loader.load();
            Scene s = new Scene(pane);
            Stage stageB = new Stage();
            stageB.setScene(s);
            stageB.setTitle("Form B");
            stageB.initOwner(borderPane.getScene().getWindow());
            stageB.initModality(Modality.APPLICATION_MODAL);
            stageB.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnCOnAction(ActionEvent event) {
    }

}
