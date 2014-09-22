package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {
	
	@FXML
	private TextField cpf;
	
	@FXML
	private PasswordField senha;

	@FXML
	private Text actiontarget;
	
	

	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		actiontarget.setText("O botão Entrar foi pressionado");
	}

}
