/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author djaramillo
 */
public class DBDirecciones {
    Conexiones con = new Conexiones();
    // inserta la última direccion del cliente el array puede tener muchos
    public int InsertarDirecciones(Cliente objCliente) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO direcciones (calle1, calle2, num, idclie)"
                + "VALUES (?,?,?,?)";
        int TamArray = objCliente.getDirecciones().size()-1; //insertar el ulitmo elemento del array
        PreparedStatement ps= con.getConnection().prepareStatement(Sentencia);
        ps.setString(1,objCliente.getDirecciones().get(TamArray).getCalle1());
        ps.setString(2,objCliente.getDirecciones().get(TamArray).getCalle2());
        ps.setString(3,objCliente.getDirecciones().get(TamArray).getNum());
        ps.setInt(4,objCliente.getIdClie());
        return ps.executeUpdate(); 
    }
    
}
