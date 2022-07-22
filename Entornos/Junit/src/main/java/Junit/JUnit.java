/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit;

/**
 *
 * @author Admin
 */
public class JUnit {
    protected int numero1;
    protected int numero2;
    protected String palabra;
    protected  int resultado;

    public int calculadoraSumRes(String palabra) {
        numero1= 10;
        numero2= 5;
        if (palabra.equalsIgnoreCase("suma")) {
            resultado=numero1+numero2;
        } else if(palabra.equalsIgnoreCase("resta")) {
            resultado=numero1+numero2;
        }
        return resultado;
    }
    public int calculadora(String operacion) {
        numero1= 10;
        numero2= 5;
        if (operacion.equalsIgnoreCase("suma")) {
            resultado=numero1+numero2;
        } else if(operacion.equalsIgnoreCase("resta")) {
            resultado=numero1+numero2;
        }
        return resultado;
    }
    public boolean esmayoromenor(int numero1, int numero2) {
        boolean mayor=false;
        if (numero1>numero2) {
            mayor = true;
        }
        if(mayor){
            System.out.println("El numero 1 es mayor que el numero 2");
        } else {
            System.out.println("El numero 2 es mayor que el numero 1");
        }
        return mayor;
    }
    public String divisionnumeros(int numero1, int numero2) {
        resultado=numero1/numero2;
        if(numero1%numero2==0) {
            palabra="la division es exacta";
        } else {
            palabra="la division no es exacta";
        }
        return  palabra;
    }


    public static void main(String[] args) {
        

    }
    
}
