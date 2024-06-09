package formular;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class SampleController {
	@FXML
	Button button1;
	@FXML
	Button button2;
	@FXML
	Button button3;
	@FXML
	ComboBox<?> combobox;

	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	@FXML
	TextField textfield3;
	@FXML
	TextField textfield4;
	@FXML
	TextField textfield5;

	@FXML
	void initialize() {
		if (button1 != null) {
			button1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					((Stage) button1.getScene().getWindow()).close();
				}
			});
		}
		if (button2 != null) {
			button2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					System.out.println(combobox.getValue());
					System.out.println(textfield1.getText());
					System.out.println(textfield2.getText());
					System.out.println(textfield3.getText());
					System.out.println(textfield4.getText());
					System.out.println(textfield5.getText());
					textfield1.getText();

				}
			});
		}
		button3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				combobox.setValue(null);
				textfield1.clear();
				textfield2.clear();
				textfield3.clear();
				textfield4.clear();
				textfield5.clear();
			}
		});
		textfield1.setPromptText("Vorname");
		textfield2.setPromptText("Nachname");
		textfield3.setPromptText("Strasse Hausnr");
		textfield5.setPromptText("Ort");
		// if(textfield4 != null) {
		// textfield4.clear();
		//
		// }
		textfield4.setPromptText("xxxxx");
		int maxDigits = 5;
		textfield4.textProperty()
				.addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
					if (newValue.length() > maxDigits) {
						textfield4.setText(oldValue);
						textfield4.setStyle("-fx-border-color: black;" + "-fx-background-color: red;");
					}

				});

		textfield4.addEventHandler(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				// Wenn das eingegebene Zeichen nicht den Zahlen 0-9 entspricht, ...
				if (!(event.getCharacter().matches("[0-9]"))) {
					// ... dann wird das Event nicht weiter verarbeitet.
					event.consume();

				}
			}

		});

	}
}
