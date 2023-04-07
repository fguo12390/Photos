package controllers;
import java.io.IOException;

import application.Main;
import javafx.application.Application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 


public class loginScreenController{
    @FXML
    private Button loginButton;

    @FXML
    private TextField userField;
        
    @FXML
    private void loginButtonSelected(ActionEvent e) throws IOException{
    	
    	System.out.println(userField.getText());
    	if(userField.getText().equals("admin")) {
    		userField.setText("option");
    	}else {
    		userField.setText("other");
    	}
    	
    	Main.changeScene("/views/nonAdminSystem");
    }
    


}
