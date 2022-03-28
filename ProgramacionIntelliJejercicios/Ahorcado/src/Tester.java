
import java.io.IOException;
import java.util.Scanner;

public class Tester {
	public static void main (String arg[]){
		boolean descubierta = false;
		Scanner lector = new Scanner(System.in);
		char letra;
		System.out.println("Bienvenido al juego del ahorcado" +
				"\nSeleccione la dificultad:" +
				"\n1. Palabra de 5 letras y 10 intentos" +
				"\n2. Palabra de 6 letras y 8 intentos" +
				"\n3. Palabra de 7 letras y 6 intentos");
		int opcion = lector.nextInt();
		Juego partida = new Juego(opcion);
		Diccionario palabra = new Diccionario(opcion);
		System.out.println(palabra.getPalabra());
		partida.palabraJuego(palabra);
		do {
			System.out.println("\nIntroduce una letra");
			try {
				letra = (char) System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}while(partida.jugando(descubierta));
	}
}
