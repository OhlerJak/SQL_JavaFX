import javafx.application.Application;
import javafx.stage.Stage;
import view.PersonController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);    
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PersonController.show(primaryStage);
    }
}
