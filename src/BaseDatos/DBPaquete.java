/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.Paquete;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author djaramillo
 */
public class DBPaquete {
    Conexiones con = new Conexiones();
    // insertar un paquete 
    public int InsertarPaquete(Paquete objPaquete) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO Paquetes (codigo,descripcion,dimensiones,peso,idclie)"
                + "VALUES (?,?,?,?,?)";
        PreparedStatement ps= con.getConnection().prepareStatement(Sentencia);
        ps.setString(1,objPaquete.getCodigo());
        ps.setString(2,objPaquete.getDescripcion());
        ps.setString(3,objPaquete.getDimensiones());
        ps.setInt(4,objPaquete.getPeso());
        ps.setInt(5, objPaquete.getCliente().getIdClie()); 
        return ps.executeUpdate(); 
        
    }        
    
    // recuperar todos los paquetes
    public ResultSet SelectPaquetes() throws ClassNotFoundException, SQLException {
        Statement st = con.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM Paquetes";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    // Selecciona un paquete en base al codigo
    public ResultSet SelectPaqueteCodigo(Paquete objPaquete) throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT * FROM paquetes WHERE codigo = ?";
        PreparedStatement ps= con.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objPaquete.getCodigo());
        return ps.executeQuery();
    }

    
}
