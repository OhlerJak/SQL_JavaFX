package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PersonController {
    @FXML
    private Button btRefresh;
    @FXML
    private Button btCancel;
    @FXML
    private Button btSave;

    public static void show(Stage stage){
        try {
            FXMLLoader loader = new FXMLLoader(PersonController.class.getResource("PersonView.fxml"));
            Parent parent = loader.load();
            stage.setScene(new Scene(parent));
            stage.setTitle("Personen Verwaltung");
            stage.show();
        }catch (Exception e) {

        }
    }
    @FXML
    private void initialize(){

    }


    public void refreshOnAction(ActionEvent actionEvent) {
    }

    public void cancelOnAction(ActionEvent actionEvent) {
    }

    public void saveOnAction(ActionEvent actionEvent) {
    }
}
