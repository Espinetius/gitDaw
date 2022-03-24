package ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
	public static void main(String args[]) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce número");
		try {
			int num = lector.nextInt();
			Comprobaciones.isPar(num);
		} catch (InputMismatchException ex) {
			System.out.println("Tienes que introducir un número");
		} catch (ParExepcion | ImparExepcion ex) {
			System.out.println(ex.getMessage());
		}
	}
}
