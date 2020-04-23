package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class SignInController implements Initializable {
    MainMenuController con=new MainMenuController();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    public void backButtonPressed(ActionEvent ae) throws IOException{
        con.changeScene(ae,"../sample/MainMenu.fxml", "kansas city library");


    }
}
