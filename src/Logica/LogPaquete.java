/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.DBEstados;
import BaseDatos.DBPaquete;
import Clases.Paquete;
import static Logica.LogCliente.objDBCliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author djaramillo
 */
public class LogPaquete {
    static DBPaquete objDBPaquete = new DBPaquete();
    static DBEstados objDBEstados = new DBEstados();
    public static void GrabarPaquete(Paquete objPaquete) throws ClassNotFoundException, SQLException {
        // grabar paquete
        objDBPaquete.InsertarPaquete(objPaquete);
        // buscar el id del paquete
        BuscarIdPaq(objPaquete);
        // insertar el paquete con el id encontrado
        objDBEstados.InsertarEstadosPaquete(objPaquete);
    }

    public static void RecuperarPaquetes(ArrayList<Paquete> ArrayPaquetes) 
            throws SQLException, ClassNotFoundException 
            {
        Paquete objPaquete = new Paquete();
        ResultSet rs = objDBPaquete.SelectPaquetes();
        while (rs.next()){ //recorrdio iterator para setear el paquete
                objPaquete = new Paquete();
                objPaquete.setIdPaq(Integer.valueOf(rs.getString(1)));
                objPaquete.setCodigo(rs.getString(2));
                objPaquete.setDescripcion(rs.getString(3));
                objPaquete.setDimensiones(rs.getString(4));
                objPaquete.setPeso(rs.getInt(5));
                ArrayPaquetes.add(objPaquete);
        }
        rs.close();
    }

    private static void BuscarIdPaq(Paquete objPaquete) throws SQLException, ClassNotFoundException {
        ResultSet rs = objDBPaquete.SelectPaqueteCodigo(objPaquete);
        while (rs.next()){
            objPaquete.setIdPaq(Integer.valueOf(rs.getString(1)));
        }
        //return objCliente;
    }
    
}
