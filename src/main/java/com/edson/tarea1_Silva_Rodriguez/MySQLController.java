package com.edson.tarea1_Silva_Rodriguez;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RestController
public class MySQLController {

    // Parámetros de conexión
    private static final String URL = "jdbc:mysql://localhost:3306/tarea2?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    @GetMapping("/sql")
    public String connectToDatabase() {
        Connection connection = null;
        String message;

        try {
            // Conectar a la base de datos
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            message = "Conexión exitosa a la base de datos MySQL";
            System.out.println(message);
        } catch (SQLException e) {
            message = "Error al conectar a la base de datos: " + e.getMessage();
            System.out.println(message);
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Conexión cerrada");
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return message;
    }
}
