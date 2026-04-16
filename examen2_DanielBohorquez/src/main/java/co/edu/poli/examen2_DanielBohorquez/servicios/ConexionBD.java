package co.edu.poli.examen2_DanielBohorquez.servicios;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/inmuebles_db";
    private static final String USER = "root";
    private static final String PASSWORD = "1234567890";

    public static Connection conectar() {

        try {

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("✔ Conectado a MySQL");

            return conn;

        } catch (Exception e) {

            System.out.println("❌ Error conexión: " + e.getMessage());

            return null;
        }
    }
}