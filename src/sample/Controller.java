package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private Button button;

    @FXML
    public void onClickMethod(){
        button.setText("Thanks!");
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("lab1.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("GPS треки отправка на сервер");
            stage.setScene(new Scene(root1));

            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
