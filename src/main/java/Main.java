import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main extends Application {

    public static Connection c;


    public static void main(String[] args) throws SQLException {
        c = DriverManager.getConnection("jdbc:derby://localhost:1527/CooleDB","app","password");

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
