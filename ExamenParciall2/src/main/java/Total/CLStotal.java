/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Total;

import Productos.CLSproductos;

/**
 *
 * @author W10
 */
public class CLStotal {
   private static String[][] operaciones = new String [4][8];
    
    private static final int Producto = 0;
    private static final int uni = 1;
    private static final int valor = 3;
    private static final int GastoV = 4;
    private static final int pe = 2;
    private static final int GastoP = 5;
    private static final int Valor_unidad = 6;
    private static final int Ctotal = 7;
    
    private static final int Segu = 3500;
    private static final int viajes = 2500;
    private static final int tax = 5000;
    private static final int acarr = 5000;
    private static final int comision = 200;
    
    private static final int TOTAL_GASTOV = Segu + tax + comision;
    private static final int TOTAL_GASTOP = viajes + acarr;
    
    private int filaActual = 0;
    private double var = 0;
    
    private final int MAX_FILAS = 4;
    private final int MAX_COLUMNAS = 8;
    private double Coeficiente = 0;
    private double CoeficienteP = 0;
    
    private int totalFilas = 0;
    
    public CLStotal (int filas){
        if (filas > MAX_FILAS){
            throw(new IllegalArgumentException());
        }else{
            totalFilas = filas;
            operaciones = new String[totalFilas][MAX_COLUMNAS];
        }
    }
    public static void imprimirDecorado(){
        for (int x=0; x<operaciones.length; x++){
            System.out.print("|");
            for(int y=0; y<operaciones[x].length; y++){
                System.out.print(operaciones[x][y]);
                if(y!=operaciones[x].length-1){
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
    public String AddMaterial(CLSproductos mat){
        if (filaActual >= MAX_FILAS){
            return "Tope";
        }else{
            operaciones[filaActual][Producto] = mat.getMaterial();
            operaciones[filaActual][uni] = mat.unidades()+"";
            operaciones[filaActual][valor] = mat.factura()+"";
            operaciones[filaActual][pe] = mat.peso()+"";
            filaActual ++;
        }
        return "Ok!";
    }
    
    public double PesoTotal(){
        double tot = 1;
        double totP = 0;
         
        for (int x = 0; x < MAX_FILAS; x++){
             for (int y = 2; y < 3; y++){
             String fil = operaciones[x][y];
             tot = Double.parseDouble(operaciones[x][1]);
             tot = tot*Double.parseDouble(fil);
             totP = totP + tot;
         }
        }
        CoeficienteP = TOTAL_GASTOP/totP;
        return totP;
    }
    public double ValorTotal(){
         double tot = 1;
         double totm = 0;
         
        for (int x = 0; x < MAX_FILAS; x++){
             for (int y = 3; y < 4; y++){
             String fil = operaciones[x][y];
             tot = Double.parseDouble(operaciones[x][1]);
             tot = tot*Double.parseDouble(fil);
             totm = totm + tot;
         }
        }
        Coeficiente = TOTAL_GASTOV/totm;
        return totm;
     }
    public double GastosAlValor(){
        double tot = 0;
        for (int y = 0; y < MAX_FILAS; y++){
            tot = Double.parseDouble(operaciones[y][valor])*Coeficiente;
            operaciones[y][GastoV] = tot+"";
        }
        return tot;
    }
    public double GastosAlPeso(){
       double tot = 0;
        for (int y = 0; y < MAX_FILAS; y++){
            tot = Double.parseDouble(operaciones[y][pe])*CoeficienteP;
            operaciones[y][GastoP] = tot+"";
        }
        return tot;
    }
    
    public double Sumatoria(){
        double tot = 0;
        for (int y = 0; y < MAX_FILAS; y++){
            for (int x = 3; x < Valor_unidad; x++){
                tot = tot + Double.parseDouble(operaciones[y][x]);
            }
            operaciones[y][Valor_unidad] = tot+"";
            tot = 0;
        }
        return tot;
    }
    public double CostoTotal(){
        double tot = 0;
        double totfinal = 0;
        for (int y = 0; y < MAX_FILAS; y++){
            tot = Double.parseDouble(operaciones[y][Valor_unidad])*Double.parseDouble(operaciones[y][uni]);
            operaciones[y][Ctotal] = tot+"";
            totfinal = tot + totfinal;
        }
        System.out.println("Su total Final es de "+totfinal);
        return tot;
    }
    
    
}
