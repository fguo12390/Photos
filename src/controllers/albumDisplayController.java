package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class albumDisplayController {

    @FXML
    private Label currentAlbumLabel;

    @FXML
    private MenuItem deleteSelectedButton;

    @FXML
    private Menu editMenu;

    @FXML
    private Menu exitMenu;

    @FXML
    private Menu fileMenu;

    @FXML
    private MenuItem importImageButton;

    @FXML
    private Menu logoutMenu;

    @FXML
    private MenuBar menuBar;

    @FXML
    private MenuItem renameSelectedButton;

}
