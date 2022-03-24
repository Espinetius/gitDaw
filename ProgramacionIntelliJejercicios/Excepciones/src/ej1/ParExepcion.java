package ej1;

public class ParExepcion extends Exception{ //en tiempo de compilacion obliga a tratamiento
	public ParExepcion(){
		super("El numero es par");
	}
	public ParExepcion (int num) {
		super("El numero " + num + " es par");
	}
	public ParExepcion(String mensaje) {
		super(mensaje);
	}

}
