package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    private static Scene scene;
    
    public static Stage mainStage;
    
    /**
     * Method that starts program and set's the initial state/scene to the login screen
     * @param stage: the stage the application is running on
     */
    @Override
    public void start(Stage stage) throws IOException {
    	mainStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/views/loginScreen.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public static void setRoot(String fxml, Object o) throws IOException {
        scene.setRoot(loadFXML(fxml));
        
    }
    
    public static void changeScene(String fxml) throws IOException {
    	Scene scene = mainStage.getScene();
        scene.setRoot(loadFXML(fxml));

    }

    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    
    
}
