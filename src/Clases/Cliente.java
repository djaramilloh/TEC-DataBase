/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author djaramillo
 */
public class Cliente {
    public int idClie;
    public String cedula;
    public String nombres;
    public String mail;
    public ArrayList<Direcciones> direcciones 
            = new ArrayList<Direcciones>(); 

    public Cliente() {
    }

    public Cliente(int idClie, String cedula, String nombre, String mail,
        int idDir, String calle1, String calle2, String num) {
        this.idClie = idClie;
        this.cedula = cedula;
        this.nombres = nombre;
        this.mail = mail;
        this.direcciones.add(new Direcciones(idDir,calle1, calle2,num));
    }

    public int getIdClie() {
        return idClie;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getMail() {
        return mail;
    }

    public ArrayList<Direcciones> getDirecciones() {
        return direcciones;
    }

    public void setIdClie(int idClie) {
        this.idClie = idClie;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDirecciones(ArrayList<Direcciones> direcciones) {
        this.direcciones = direcciones;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idClie=" + idClie + ", cedula=" + cedula + ", nombres=" + nombres + ", mail=" + mail + ", direcciones=" + direcciones + '}';
    }

    
}
