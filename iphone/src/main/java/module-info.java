module com.smartphone.iphone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.smartphone.iphone to javafx.fxml;
    exports com.smartphone.iphone;
}