/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author djaramillo
 */
public class Conexiones {
     //Conectarse a la BDD
    public Connection con;
    
    public Connection getConnection () throws ClassNotFoundException, SQLException {
        // nueve driver de conexion a base mysql 8.
        String driver = "com.mysql.cj.jdbc.Driver";
        
        String url = "jdbc:mysql://localhost:3306/MSOO"; //127.0.0.1
        Class.forName(driver);
        return DriverManager.getConnection(url,"root","12345678");
    }
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException{
        con = getConnection();
        return con;
    }
    public void CerrarConexion() throws SQLException{
       con.close();
    }
}
