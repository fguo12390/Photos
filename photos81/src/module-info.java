module Photos81 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	opens views to javafx.graphics, javafx.fxml;
	opens controllers to javafx.graphics, javafx.fxml;
}
