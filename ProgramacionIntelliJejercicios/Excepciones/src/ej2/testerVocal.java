package ej2;

import java.io.IOException;
import java.util.Scanner;

public class testerVocal {
	public static void main(String arg[]) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca un caracter");
		try {
			char a = (char) System.in.read();
			isVocal.isVocal(a);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (VocalExpection | ConsonanteException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
