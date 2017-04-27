/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kakurofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 *
 * @author Anthony
 */
public class FXMLDocumentController implements Initializable {
    
    private String[] llaves = new String[2];
    
    @FXML
    private Button button1;
    private Button lector;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        button1.setText("14→\n30↓");
    }
    
    @FXML
    private void leerTextoBoton(ActionEvent event){
        llaves = button1.getText().split("\n");
        System.out.println("Valor de llaves: ["+llaves[0]+","+llaves[1]+"]");
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
