module kr.ac.daelim.ch03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens kr.ac.daelim.ch03 to javafx.fxml;
    exports kr.ac.daelim.ch03;
}