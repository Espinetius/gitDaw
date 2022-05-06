/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajunit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JUNIT {
    public void piramide(int filas) {
        Scanner teclado = new Scanner(System.in);
        boolean valor = false;
        System.out.println("Indica cuantas filas quieres de la piramide");
        filas = teclado.nextInt();
        int medio = 1;
        for (int i = 0; i <= filas; i++) {
            for (int j = 1; j <= filas; j++) {
                if (medio%2!=0) {
                    while (valor==true) {
                        if (i==0) {
                        System.out.print(i);
                        } else {
                            valor=true;
                        }
                    }
                    System.out.print(medio);
                    
                }
                medio++;
            }
            System.out.println();
            
        }
    }
        public  void ej15(int num1, int num2) {
        Scanner teclado = new Scanner(System.in);
        int resultado, i;
        System.out.println("Introduce dos numeros");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        resultado=0;
        for (i=2; i<=num1; i++) {
            System.out.print(num2+"+");
            resultado=resultado+num2;
                            
        }
        System.out.println(num2+"="+resultado);
        // TODO code application logic here
    
    }
    public void ej9(int num) {
        Scanner teclado = new Scanner(System.in);
        int factorial, numero;
        factorial = 1;
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        numero=num;
        for (; num>=1; num--) {
            factorial=num*factorial;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        // TODO code application logic here
    }
    public void ej13(int N) {
        Scanner teclado = new Scanner(System.in);
        int f, c;
        char simbolo = '*';
        f = 1;
        System.out.println("Introduce un numero sin contar con el 0");
        N = teclado.nextInt();
        while (N==0) {
            System.out.println("Introduce otro numero, diferente al 0");
            N = teclado.nextInt();
        }
        
        for (f=1;f<=N;f++) {
            for (c=1;c<=f; c++) {
                System.out.print(simbolo);
            }
            System.out.println("");
        }
        // TODO code application logic here
    }
    
}
