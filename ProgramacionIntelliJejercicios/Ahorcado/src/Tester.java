import java.util.Scanner;

public class Tester {
	public static void main (String arg[]){
		Scanner lector = new Scanner(System.in);
		System.out.println("Bienvenido al juego del ahorcado" +
				"\nSeleccione la dificultad:" +
				"\n1. Palabra de 5 letras" +
				"\n2. Palabra de 6 letras" +
				"\n3. Palabra de 7 letras");
		int opcion = lector.nextInt();
		Juego partida = new Juego(opcion);
	}
}
