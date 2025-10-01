module com.example.exercicio2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicio2 to javafx.fxml;
    exports com.example.exercicio2;
    exports com.example.exercicio2.Ex2;

    opens com.example.exercicio2.Ex2 to javafx.fxml;
    opens com.example.exercicio2.Ex3 to javafx.fxml;
    opens com.example.exercicio2.Ex4 to javafx.fxml;
    opens com.example.exercicio2.Ex5 to javafx.fxml;
}