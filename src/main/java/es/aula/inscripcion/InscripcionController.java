package es.aula.inscripcion;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class InscripcionController {

    @FXML
    private TextField nombreField;

    @FXML
    private ComboBox<String> modalidadCombo;

    @FXML
    private DatePicker fechaPicker;

    @FXML
    private CheckBox materialCheck;

    @FXML
    private TextArea observacionesArea;

    @FXML
    public void initialize() {
        modalidadCombo.getItems().addAll("EA SPORTS FC","Fortnite","Minecraft");
    }

    public void volverInicio(ActionEvent event)
            throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/es/aula/inscripcion/bienvenida.fxml"));
         cambiarPantalla(event, root, "GameZone");
    }

    public void mostrarResumen(ActionEvent event)
            throws IOException {

        String nombre = nombreField.getText();
        String modalidad = modalidadCombo.getValue();
        String fecha = "";

        if (fechaPicker.getValue() != null) {
            fecha = fechaPicker.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }

        String material;

        if (materialCheck.isSelected()) {
            material = "Sí";
        } else {
            material = "No";
        }

        String observaciones = observacionesArea.getText();

        if (observaciones == null || observaciones.isBlank()) {
            observaciones = "Sin observaciones";
        }

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/es/aula/inscripcion/resumen.fxml"));

        Parent root = loader.load();

        ResumenController controlador = loader.getController();

        controlador.mostrarDatos( nombre,modalidad,fecha, material, observaciones);

        cambiarPantalla(event, root, "GameZone - Resumen");
    }

    private void cambiarPantalla(
            ActionEvent event, Parent root, String titulo) {

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle(titulo);
        stage.show();
    }
}
