package tengi.tienda_de_pedidos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_BASEDATOS {
    private static final String URL = "jdbc:mysql://localhost:3306/Conexion_BASEDATOS";
    private static final String USUARIO = "root";
    private static final String CONTRASENIA = "123456";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }
    }
}
