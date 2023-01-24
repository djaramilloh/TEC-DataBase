/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author djaramillo
 * 
 */
public class DBCliente {
    Conexiones con = new Conexiones();
    
    //metodo para recuperar un cliente en base al numero de cedula
    public ResultSet SelectClienteCedula(Cliente objCliente) throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT * FROM clientes where cedula = ?";
        PreparedStatement ps= con.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objCliente.getCedula());
        return ps.executeQuery();
    }  

    // inserta un cliente en la base de datos
    public int InsertarCliente(Cliente objCliente) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO clientes (cedula, nombres, mail)"
                + "VALUES (?,?,?)";
        PreparedStatement ps = con.getConnection().prepareStatement(Sentencia);
        // para cada parametro se asigna el valor a insertar
        ps.setString(1,objCliente.getCedula());
        ps.setString(2,objCliente.getNombres());
        ps.setString(3,objCliente.getMail());
        // instruccion ejecuta la sentencia en la base de datos
        return ps.executeUpdate(); 
    }
    
    //metodo para recuperar un cliente en base al numero de cedula
    public ResultSet SelectClientes(Cliente objCliente) throws ClassNotFoundException, SQLException {
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM Clientes";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }  
}
