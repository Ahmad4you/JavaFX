package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	
	@FXML
	private Label lblStatus;
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtPass;
	@FXML
	private javafx.scene.control.Button btnClose;
	
	@FXML
	public void closeButtonAktion(ActionEvent event) {
		Stage stage = (Stage) btnClose.getScene().getWindow();
		stage.close();
		
	}
	
	@FXML
	public void Login(ActionEvent event) throws Exception {
		if(txtName.getText().equals("user") && txtPass.getText().equals("1234")) {
			lblStatus.setText("Login Success!!!");
			
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/FXMLSconde.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}else {
			lblStatus.setText("Login Faild???");
		}
	}

}
