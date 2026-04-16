package co.edu.poli.examen2_DanielBohorquez.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/co/edu/poli/examen2_DanielBohorquez/formInmueble.fxml")
        );

        Scene scene = new Scene(loader.load(), 500, 400);

        stage.setTitle("Gestión de Inmuebles");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}