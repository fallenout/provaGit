
package it.fabiomasola.boh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class bohController {

    @FXML
    private TextField txtNome;

   @FXML
   private Button btnCiao;

    @FXML
    private TextArea areaSaluto;

    @FXML
    void handleclick(ActionEvent event) {
    	System.out.println(txtNome.getText());
    	
    	areaSaluto.setText( txtNome.getText());
    	txtNome.setText("");
    	System.out.println("hello");
    	

    }

}
