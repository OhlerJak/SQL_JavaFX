import database.Database;
import javafx.application.Application;
import javafx.stage.Stage;
import view.PersonController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        PersonController.show(primaryStage);
    }

    @Override
    public void init() throws Exception {
        super.init();

    }

    @Override
    public void stop() throws Exception {
        super.stop();

    }
}
