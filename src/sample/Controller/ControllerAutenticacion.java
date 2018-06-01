package sample.Controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import javax.swing.*;

public class ControllerAutenticacion {

    @FXML JFXTextField usuario;
    @FXML JFXPasswordField contrasena;
    public void onExitButtonClicked(MouseEvent event){
        Platform.exit();
        System.exit(0);
    }

    public void onAuthenticateButtonClicked(MouseEvent event){
        //Convierte la contraseña a string ya que la captura como char
        if(usuario.getText().trim().equals("") ) {
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los campos");
        }
    }
}
