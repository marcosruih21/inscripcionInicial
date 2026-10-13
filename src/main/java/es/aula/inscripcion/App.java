package es.aula.inscripcion;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(
            App.class.getResource("/es/aula/inscripcion/bienvenida.fxml")
        );
        Parent root = loader.load();
        Scene scene = new Scene(root, 480, 240);
        stage.setTitle("Inscripción a un juego");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
