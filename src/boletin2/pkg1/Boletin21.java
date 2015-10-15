/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg1;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
 
 /*
 PRUEBA PARA PULL
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base, altura;
        System.out.println("Introduce la base");
        Scanner baseTeclado = new Scanner(System.in);
        base = baseTeclado.nextFloat();
        System.out.println("Introduce la altura");
        Scanner alturaTeclado = new Scanner(System.in);
        altura = alturaTeclado.nextFloat();
        System.out.println("El area es: "+base*altura/2);
        
        
        // TODO code application logic here
    }
    
}
