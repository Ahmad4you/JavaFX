package color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXexemple extends Application {

	@Override
	public void start(Stage stage) {
		Group root = new Group();
		Scene scene = new Scene(root, 400, 250 );
		stage.setTitle("JavaFX Color");
		stage.setScene(scene);
				
		stage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
