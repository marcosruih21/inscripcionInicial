package es.aula.inscripcion;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class BienvenidaController {

    public void abrirInscripcion(ActionEvent event)
            throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/es/aula/inscripcion/inscripcion.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()) .getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("GameZone - Inscripción");
        stage.show();
    }
}
