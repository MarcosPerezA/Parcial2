/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenparciall2;

import Productos.CLSproductos;
import Total.CLStotal;

/**
 *
 * @author W10
 */
public class clsinicio {
    public static void main(String[] args) {
        CLSproductos producto = new CLSproductos();
        CLStotal matriz = new CLStotal(4);
        
        producto.setproducto("Cemento");
        producto.setunidad(50);
        producto.setfactura(60);
        producto.setpeso(50);
        matriz.AddMaterial(producto);
        
        producto.setproducto("Cal");
        producto.setunidad(150);
        producto.setfactura(40);
        producto.setpeso(20);
        matriz.AddMaterial(producto);
        
        producto.setproducto("Tubos PBC");
        producto.setunidad(200);
        producto.setfactura(55);
        producto.setpeso(10);
        matriz.AddMaterial(producto);
        
        producto.setproducto("Quintales de hierro");
        producto.setunidad(50);
        producto.setfactura(350);
        producto.setpeso(50);
        matriz.AddMaterial(producto);
        System.out.println("\t\t\t\t\tMatriz\t\t\t\t\t");
        matriz.imprimirDecorado();
        matriz.ValorTotal();
        matriz.PesoTotal();
        matriz.GastosAlValor();
        matriz.GastosAlPeso();
        matriz.Sumatoria();
        matriz.CostoTotal();
        System.out.println("\t\t\t\t\tMatriz\t\t\t\t\t");
        matriz.imprimirDecorado();
    }
    
}
