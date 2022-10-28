module com.eapp.encryptapp {
  requires javafx.controls;
  requires javafx.fxml;

  opens com.eapp.encryptapp to javafx.fxml;
  exports com.eapp.encryptapp;
}