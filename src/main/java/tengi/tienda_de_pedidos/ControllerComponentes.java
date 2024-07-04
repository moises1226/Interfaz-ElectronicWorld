package tengi.tienda_de_pedidos;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.util.Duration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControllerComponentes {


    @FXML
    private TextField nombreApellidoField;

    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField verificacionField;
    @FXML
    private Button btn_enviar;
    @FXML
    private Text TextoEnviado;



    @FXML
    private void enviarDatos() {
        String nombre = nombreApellidoField.getText();
        String password = passwordField.getText();


        guardarDatosEnBaseDeDatos(nombre, password);
    }

    private void guardarDatosEnBaseDeDatos(String nombre, String password) {

        Conexion_BASEDATOS conexion = new Conexion_BASEDATOS();
        try {
            Connection connection = conexion.getConnection();
            String query = "INSERT INTO Usuarios (nombre_Apellido, contraseña) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nombre);
            statement.setString(2, password);
            statement.executeUpdate();
            mostrarMensajeExito();
            limpiarDatos();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void mostrarMensajeExito() {
        TextoEnviado.setVisible(true);
        Timeline tempoAparecerDesaparecer = new Timeline(new KeyFrame(Duration.seconds(0.5), event -> TextoEnviado.setVisible(false)));
        tempoAparecerDesaparecer.play();
    }


    private void limpiarDatos(){

        nombreApellidoField.setText("");
        passwordField.setText("");
        verificacionField.setText("");


    }

        @FXML
        private Pane panel_registro;

        @FXML
        private void CambioDePaneles(){

            panel_registro.setVisible(true);


    }



}
