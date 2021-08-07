/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class CLSproductos {
    private String Mat;
    private double factura;
    private int unidades;
    private double pes;
    
    
     public static void llenaInformacion(){
        Scanner t = new Scanner(System.in);
        
        
    }

    /**
     * @param mat the Material to set
     */
    public void setproducto(String mat) {
        this.Mat = mat;
    }

    /**
     * @param factu the Val_factura to set
     */
    public void setfactura(double factu) {
        this.factura = factu;
    }

    /**
     * @param unidad the No_unidades to set
     */
    public void setunidad(int unidad) {
        this.unidades = unidad;
    }

    /**
     * @return the Material
     */
    public String getMaterial() {
        return Mat;
    }

    /**
     * @return the Val_factura
     */
    public double factura() {
        return factura;
    }

    /**
     * @return the No_unidades
     */
    public int unidades() {
        return unidades;
    }

    /**
     * @return the Peso
     */
    public double peso() {
        return pes;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setpeso(double Peso) {
        this.pes = Peso;
    }
    
    
}
