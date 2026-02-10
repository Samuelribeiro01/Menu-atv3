module com.example.praticamenu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.praticamenu.controller to javafx.fxml;
    exports com.example.praticamenu;
}