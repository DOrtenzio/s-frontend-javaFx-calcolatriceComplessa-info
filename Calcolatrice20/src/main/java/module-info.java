module com.example.calcolatrice20 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calcolatrice20 to javafx.fxml;
    exports com.example.calcolatrice20;
}