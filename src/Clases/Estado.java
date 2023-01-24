/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author djaramillo
 */
public class Estado {
    public int idEst;
    public String desEstado;
    public Date fecha;

    public Estado(int idEst, String descEstado, Date fecha) {
        this.idEst = idEst;
        this.desEstado = descEstado;
        this.fecha = fecha;
    }

    public Estado() {
    }

    public int getIdEst() {
        return idEst;
    }

    public String getDesEstado() {
        return desEstado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setIdEst(int idEst) {
        this.idEst = idEst;
    }

    public void setDesEstado(String desEstado) {
        this.desEstado = desEstado;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Estado{" + "idEst=" + idEst + ", desEstado=" + desEstado + ", fecha=" + fecha + '}';
    }
    
    
}
