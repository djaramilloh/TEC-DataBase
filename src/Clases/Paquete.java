/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.time.temporal.TemporalQueries.localDate;
import java.util.Date;

/**
 *  Fecha: 12 de enero del 2023
 * @author djaramillo
 */
public class Paquete {
    public int idPaq;
    public String codigo;
    public String descripcion;
    public String dimensiones;
    public int peso;
    public Cliente cliente;
    public Estado[] estados = new Estado[4];

    public Paquete() { //constructor vacio
    }
    
    // constructor sobrecargado
    public Paquete(int idPaq, String codigo, String descripcion, String dimensiones, int peso,
            Cliente cliente) {
        this.idPaq = idPaq;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.dimensiones = dimensiones;
        this.peso = peso;
        this.cliente = cliente;
        // cuando cree el paquete se creará el estado inicial
        CrearEstados();
    }
    
    public void CrearEstados(){
        this.estados[0] = new Estado(0,"Creación", new Date());
        this.estados[1] = new Estado(0,"Bodega",null);
        this.estados[2] = new Estado(0,"Despacho",null);
        this.estados[3] = new Estado(0,"entrega",null);
    }

    public int getIdPaq() {
        return idPaq;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public int getPeso() {
        return peso;
    }
    //agregado

    public Cliente getCliente() {
        return cliente;
    }

    public Estado[] getEstados() {
        return estados;
    }

    

    public void setIdPaq(int idPaq) {
        this.idPaq = idPaq;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEstados(Estado[] estados) {
        this.estados = estados;
    }

    
    @Override
    public String toString() {
        return "Paquete{" + "idPaq=" + idPaq + ", codigo=" + codigo + ", descripcion=" + descripcion + ", dimensiones=" + dimensiones + ", peso=" + peso + ", estados=" + estados + '}';
    }

}
