package tengi.tienda_de_pedidos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controlador_InterfazAPP extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Controlador_InterfazAPP.class.getResource("InterfazPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),  871, 539);
        stage.setTitle("Verificador de Computadora");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}