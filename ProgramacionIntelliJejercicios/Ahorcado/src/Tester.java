import java.io.IOException;
import java.util.Scanner;

public class Tester {
	public static void main (String arg[]) throws IOException {
		Scanner lector = new Scanner(System.in);
		int opcion;
		boolean salida = false;
		Diccionario diccionariopalabras = new Diccionario();
		Juego partida = new Juego();
		MenuJuego juego = new MenuJuego();
			System.out.println("Bienvenido al juego del ahorcado. Seleccione una opcion de la lista:" +
					"\n1. Jugar." +
					"\n2. Gestionar diccionarios" +
					"\n3. Salir");
			switch (opcion = lector.nextInt()) {
				case 1:
					juego.juego();
					break;
				case 2:
					juego.gestion();
					break;
				case 3:
					System.out.println("Gracias por jugar");
					salida = true;
					break;
				default:
					System.out.println("No ha seleccionado una opcion valida");
			}

	}
}
