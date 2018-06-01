package sample.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class ControllerRegistroUsuario {

        @FXML JFXButton registrarButton;
        @FXML JFXTextField nombre;
        @FXML JFXTextField apellido;
        @FXML JFXTextField telefono;
        @FXML JFXTextField direccion;
        @FXML AnchorPane panelRegistroUsuario;

        public void onRegistrarButtonClicked(MouseEvent event){
            ObservableList<Node> components = panelRegistroUsuario.getChildren();
            boolean camposNoAptos;
            /*
            for (int i =0; i<components.length(); i++){
                if (components[i] instanceof JFXTextField){
                    if(!textFieldVacios(components[i])){
                        i = 1+components.lenght();
                    }

                }
            }
            mensaje:"campos erroneos";
            */

            //oeoe
        }

        public boolean textFieldVacios(JFXTextField campoDeTexto){
            if (campoDeTexto.getText().trim().isEmpty() ||campoDeTexto.getText() == null){
                return true;
            }
            return false;
        }

}
