package tengi.tienda_de_pedidos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_BASEDATOS{
    private static final String DB_NAME = "conector_Javafx";
    private static final String DB_USER = "nombre_Apellido";
    private static final String DB_PASSWORD = "contraseña";
    private static final String DB_URL = "jdbc:mysql://localhost/" + DB_NAME;

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Error al conectar a la base de datos", e);

        }
    }
}
