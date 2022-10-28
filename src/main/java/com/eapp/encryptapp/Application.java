package com.eapp.encryptapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("interface.fxml"));
    Parent root = fxmlLoader.load();
    Scene scene = new Scene(root, 320, 240);
    stage.setTitle("Encrypt");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    //launch();
    CpInterface cp = new CpData();
    cp.arSize(94);
    cp.rotationSpec(55);
    cp.rotate();
    String message = "SOME SECRET MESSAGE";
    String coded = cp.encrypt(message);
    System.out.println(coded);
    String decoded = cp.decrypt(coded);
    System.out.println(decoded);
  }
}