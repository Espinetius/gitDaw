package ej1;

public class Comprobaciones {
	public static void isPar(int a) throws ParExepcion, ImparExepcion {
		if (a%2==0) {
			throw new ParExepcion("es par");
		} else {
			throw new ImparExepcion("es impar");
		}
	}
}
