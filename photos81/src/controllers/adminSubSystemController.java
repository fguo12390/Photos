package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class adminSubSystemController {

    @FXML
    private Menu exitMenu;

    @FXML
    private Menu fileMenu;

    @FXML
    private MenuItem insertUserSelection;

    @FXML
    private Menu logoutMenu;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Button removeButton;

    @FXML
    private ListView<?> userList;

    public void start() {

    }
    public void initialize(URL url, ResourceBundle rb) {
    	System.out.println("initialize");
    	
    	//populate list views
    	data =  FXCollections.observableArrayList(Main.storage.currentUser().userAlbums());
    }

    public void removeButton(ActionEvent e){
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Remove user");
			alert.setContentText("Remove user: "+data.getSelectionModel().getSelectedItem()+"?");
			Optional<ButtonType> result = alert.showAndWait();
			
			if(result.get() == ButtonType.OK){
				int index = searchForUser(data.getSelectionModel().getSelectedItem());
			data.remove(index);
				start();
			}
		}
	}

    /**
     * Logs the current user out of their session
     * @param e: action of interacting with the button
     * @throws IOException
     */
    @FXML
    private void logout(ActionEvent e) throws IOException{
    	System.out.println("logging out");
    	Main.changeScene("/views/loginScreen");
    }
    
    /**
     * Exits the session by closing the window
     * @param e: action of interacting with the button
     * @throws IOException
     */
    @FXML
    private void exitProgram(ActionEvent e) throws IOException{
    	System.out.println("exiting");
    	Main.mainStage.close();
    }
}
