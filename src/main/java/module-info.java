module com.itproger.calcutator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.itproger.calcutator to javafx.fxml;
    exports com.itproger.calcutator;
}