module tengi.tienda_de_pedidos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires mysql.connector.j;
    requires java.desktop;

    opens tengi.tienda_de_pedidos to javafx.fxml;
    exports tengi.tienda_de_pedidos;
}