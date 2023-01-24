/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.DBCliente;
import BaseDatos.DBDirecciones;
import Clases.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author djaramillo
 */
public class LogCliente {
    static DBCliente objDBCliente = new DBCliente();
    static DBDirecciones objDBDirecciones = new DBDirecciones();
    
    public Cliente BuscarClienteCedula(Cliente objCliente) throws SQLException, ClassNotFoundException {
        ResultSet rs = objDBCliente.SelectClienteCedula(objCliente);
        //recorrer el result set para crear el objeto SET
        while (rs.next()){
            objCliente.setIdClie(Integer.valueOf(rs.getString(1)));
            objCliente.setNombres(rs.getString(3));  
            objCliente.setMail(rs.getString(4));
        }
        return objCliente;
    }

    public void GrabarCliente(Cliente objCliente) throws ClassNotFoundException, SQLException {
        // primero se graba el cleinte
        objDBCliente.InsertarCliente(objCliente);
        
        //obtener el id del cliente que se acaba de ingresar
        BuscarIdCliente(objCliente);
        
        // grabar las direcciones del cliente
        objDBDirecciones.InsertarDirecciones(objCliente);
    }

    private void BuscarIdCliente(Cliente objCliente) throws ClassNotFoundException, SQLException {
        // traer de la base de datos 
        ResultSet rs = objDBCliente.SelectClienteCedula(objCliente);
        // lo recorre para garantizar un cliente
        while (rs.next()){
            objCliente.setIdClie(Integer.valueOf(rs.getString(1)));  // con el valor que obtuvo se setea en cliente
        }
    }
    
}
