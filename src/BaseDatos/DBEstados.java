/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.Estado;
import Clases.Paquete; 
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author djaramillo
 */
public class DBEstados {
    Conexiones con = new Conexiones();
    // insertar los 4 estados del paquete
    public void InsertarEstadosPaquete(Paquete objPaquete) throws ClassNotFoundException, SQLException {
        String Sentencia;
        PreparedStatement ps;
        int x;
        java.sql.Date sqlDate; // variable tipo fecha para trabajar en SQL
        for (Estado objEstado : objPaquete.getEstados()){
            Sentencia = "INSERT INTO Estados (desEstado,fecha,idPaq)"
                + "VALUES (?,?,?)";
            ps= con.getConnection().prepareStatement(Sentencia);
            if (objEstado.getFecha() != null) //si la fecha es nula dara error
                sqlDate = new java.sql.Date(objEstado.getFecha().getTime());
            else 
                sqlDate = null;
            ps.setString(1,objEstado.getDesEstado());
            ps.setDate(2,sqlDate );
            ps.setInt(3,objPaquete.getIdPaq());
            x = ps.executeUpdate();
        }
    }
    
}
