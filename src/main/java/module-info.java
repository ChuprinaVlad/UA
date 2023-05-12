module com.example.ua {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ua to javafx.fxml;
    exports com.example.ua;
}