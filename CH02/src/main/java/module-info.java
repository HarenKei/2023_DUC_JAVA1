module kr.ac.daelim.ch02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens kr.ac.daelim.ch02 to javafx.fxml;
    exports kr.ac.daelim.ch02;
}