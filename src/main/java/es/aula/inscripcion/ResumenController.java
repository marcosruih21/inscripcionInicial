package es.aula.inscripcion;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class ResumenController {

    @FXML
    private Label nombreResumenLabel;

    @FXML
    private Label modalidadResumenLabel;

    @FXML
    private Label fechaResumenLabel;

    @FXML
    private Label materialResumenLabel;

    @FXML
    private Label observacionesResumenLabel;

    public void mostrarDatos( String nombre,String modalidad,String fecha,String material,String observaciones) {

        if (nombre == null || nombre.isBlank()) {
            nombre = "No indicado";
        }

        if (modalidad == null || modalidad.isBlank()) {
            modalidad = "No seleccionada";
        }

        if (fecha == null || fecha.isBlank()) {
            fecha = "No seleccionada";
        }

        nombreResumenLabel.setText(nombre);
        modalidadResumenLabel.setText(modalidad);
        fechaResumenLabel.setText(fecha);
        materialResumenLabel.setText(material);
        observacionesResumenLabel.setText(observaciones);
    }

    public void volverFormulario(ActionEvent event)
            throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/es/aula/inscripcion/inscripcion.fxml"));

        cambiarPantalla(event, root, "GameZone - Inscripción");
    }

    public void volverInicio(ActionEvent event)
            throws IOException {

        Parent root = FXMLLoader.load(
                getClass().getResource("/es/aula/inscripcion/bienvenida.fxml"));

        cambiarPantalla(event, root, "GameZone");
    }

    private void cambiarPantalla(
            ActionEvent event, Parent root, String titulo) {

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle(titulo);
        stage.show();
    }
}
