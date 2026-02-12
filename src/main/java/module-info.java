module com.example.praticamenu {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.praticamenu.controller to javafx.fxml;
    exports com.example.praticamenu;
}