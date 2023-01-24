/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;

import Clases.Cliente;
import Clases.Direcciones;
import Clases.Paquete;
import Logica.LogCliente;
import Logica.LogPaquete;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author djaramillo
 */
public class PrincipalRes {
    static Scanner sc = new Scanner(System.in);
    static String entrada;
    static Cliente objCliente = new Cliente();
    static ArrayList<Direcciones> ArrayDirecciones = new ArrayList<>();
    static Paquete objPaquete = new Paquete();
    static LogPaquete objLogPaquete = new LogPaquete();
    static LogCliente objLogCliente = new LogCliente();

    // recuperar los paquetes en un array List
    static ArrayList<Paquete> ArrayPaquetes = new ArrayList<>();
    // importar la clase ArrayList

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        int op = 0;
        do{
            System.out.println("QUE DESEA REALIZAR");
            System.out.println("CREAR PAQUETE          <1>");
            System.out.println("CREA CLIENTE           <2>");
            System.out.println("LISTAR PAQUETES        <3>");
            System.out.println("SALIR                  <4>");
            op = Integer.parseInt(sc.nextLine());
            switch (op){
                case 1: CrearPaquete(objPaquete); break;
                case 2: CrearCliente(objCliente); break;
                case 3: ListarPaquete(); break;
            }
        } while(op != 4);
    }

    private static void CrearPaquete(Paquete objPaquete) throws ClassNotFoundException, SQLException {
        LogCliente objLogCliente = new LogCliente();
        objPaquete = new Paquete();
        System.out.println("Ingrese el codigo paquete ");
        entrada = sc.nextLine();
        objPaquete.setCodigo(entrada);
        System.out.println("Ingrese descripcion de paquete ");
        entrada = sc.nextLine();
        objPaquete.setDescripcion(entrada);
        System.out.println("Ingrese dimension del paquete");
        entrada = sc.nextLine();
        objPaquete.setDimensiones(entrada);
        System.out.println("Ingrese el peso paquete (valor entero)");
        entrada = sc.nextLine();
        objPaquete.setPeso(Integer.parseInt(entrada));
        System.out.println("Ingrese cedula cliente");
        entrada = sc.nextLine();
        objCliente.setCedula(entrada);
        objCliente = objLogCliente.BuscarClienteCedula(objCliente);
        if (objCliente.getIdClie() == 0)
            System.out.println("Cliente No existe: opcion crear cliente");
        else{
            objPaquete.setCliente(objCliente);
            objPaquete.CrearEstados();
            LogPaquete.GrabarPaquete(objPaquete);
            System.out.println("Paquete Creado ");
        }
    }

    private static void ListarPaquete() throws SQLException, ClassNotFoundException {
        LogPaquete.RecuperarPaquetes(ArrayPaquetes);
        for (Paquete objPaquete : ArrayPaquetes){
            System.out.println(objPaquete.toString());
        }
    }

    private static void CrearCliente(Cliente objCliente) throws ClassNotFoundException, SQLException {
        String cedula, nombres, mail, calle1, calle2, num;
        System.out.println("Ingrese cedula del cliente ");
        cedula = sc.nextLine();
        System.out.println("Ingrese nombres del cliente ");
        nombres = sc.nextLine();
        System.out.println("Ingrese mail del cliente ");
        mail = sc.nextLine();
        System.out.println("Ingrese calle1 cliente ");
        calle1 = sc.nextLine();
        System.out.println("Ingrese calle2 cliente ");
        calle2 = sc.nextLine();
        System.out.println("Ingrese num cliente ");
        num = sc.nextLine();
        objCliente = new Cliente(0,cedula, nombres, mail,0, calle1, calle2, num);
        // llamar al metodo de la capa de Logica del cliente
        objLogCliente.GrabarCliente(objCliente);
    }
    
}
