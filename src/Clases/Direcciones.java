/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author djaramillo
 */
public class Direcciones {
    public int idDir;
    public String calle1;
    public String calle2;
    public String num;

    public Direcciones() {
    }

    public Direcciones(int idDir, String calle1, String calle2, String num) {
        this.idDir = idDir;
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.num = num;
    }

    public int getIdDir() {
        return idDir;
    }

    public String getCalle1() {
        return calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public String getNum() {
        return num;
    }

    public void setIdDir(int idDir) {
        this.idDir = idDir;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Direcciones{" + "idDir=" + idDir + ", calle1=" + calle1 + ", calle2=" + calle2 + ", num=" + num + '}';
    }
    
    
    
}
