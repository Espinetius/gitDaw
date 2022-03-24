package ej1;

public class ImparExepcion extends Exception{ //en tiempo de compilacion obliga a tratamiento
	public ImparExepcion(){
		super("El numero es impar");
	}
	public ImparExepcion (int num) {
		super("El numero " + num + " es impar");
	}
	public ImparExepcion(String mensaje) {
		super(mensaje);
	}

}
