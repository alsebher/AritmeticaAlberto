/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author Alumno Mañana
 */
public class Operaciones {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Operaciones(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Operaciones{" + "valor=" + valor + '}';
    }
    
    
    
    
    
    public int sumar(int b){
        return this.valor+b;
    }
    
    public int restar(int b){
        return this.valor-b;
    }
    
    public int multiplicar(int b){
        return this.valor*b;
    }
    
    public double dividir(int b){
        return this.valor/b;
    }
}
