/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import common.Operaciones;

/**
 *
 * @author Alumno Mañana
 */
public class AritmeticaAlberto {
    public static void main(String[] args) {
        Operaciones n1 = new Operaciones(10);
        int n2 = 6;
        System.out.println("Los números son: "+n1.getValor()+" y "+n2);
        System.out.println("La suma de ambos es: "+n1.sumar(n2));
        System.out.println("La diferencia de ambos es: "+n1.restar(n2));
        System.out.println("El producto de ambos es: "+n1.multiplicar(n2));
        System.out.println("El cociente de ambos es: "+n1.dividir(n2));
    }
    
}
