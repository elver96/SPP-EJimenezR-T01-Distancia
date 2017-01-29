/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejimenezr.t01.distancia;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPPEJimenezRT01Distancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Determinar la distancia entre 2 puntos");
        //Declaracion de variables
        int opEntrada;
        double x1, x2, y1, y2, D, dx, dy;
        Scanner kb= new Scanner (System.in);
        //Solicitud de coordenadas
        System.out.println("Introduzca primer coordenada en X");
        x1= kb.nextDouble();
        System.out.println("Introduzca primer coordenada en Y");
        y1= kb.nextDouble();
        System.out.println("Introduzca segunda coordenada en X");
        x2= kb.nextDouble();
        System.out.println("Introduzca segunda coordenada en Y");
        y2= kb.nextDouble();
        //Realizar operaciones
        dx=(x1-x2);
        dy=(y1-y2);
        D= (Math.pow(dx, 2))+(Math.pow(dy, 2));
        //Obtencion de distancia
        System.out.println("La distancia entre las coordenadas es "+ Math.sqrt(D));
    }
    
}
