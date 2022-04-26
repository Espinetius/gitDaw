import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
	public static void main (String arg[]){
		Scanner lector = new Scanner(System.in);
		int opcion=4;
		String pass="palomeras";
		String contraseña=null;
		boolean salida = false;
		Diccionario diccionariopalabras = new Diccionario();
		MenuJuego juego = new MenuJuego();
		do {
			System.out.println("Bienvenido al juego del ahorcado. Seleccione una opcion de la lista:" +
					"\n1. Jugar." +
					"\n2. Gestionar diccionarios" +
					"\n3. Salir");
			try {
				opcion = lector.nextInt();
			}catch (InputMismatchException | NullPointerException ex) {
				ex.getMessage();
				lector.nextLine();
			}
			switch (opcion) {
				case 1:
					try {
						juego.juego(diccionariopalabras);
					} catch (ExepcionPropia e) {
						e.printStackTrace();
					}
					break;
				case 2:
					System.out.println("Introduzca la contraseña");
					lector.nextLine();
					try {
						contraseña = lector.nextLine();
						int i = 1;
						while (contraseña == null || !contraseña.equals(pass)) {
							if (i >= 3) {
								System.out.println("Recuerda, la contraseña es: 'palomeras'");
							}
							System.out.println("Introduzca la contraseña correcta");
							contraseña = lector.nextLine();
							i++;
						}
					} catch (InputMismatchException ex) {
						ex.getMessage();
					}
					juego.gestion(diccionariopalabras);
					break;
				case 3:
					System.out.println("Gracias por jugar");
					salida = true;
					break;
				default:
					System.out.println("No ha seleccionado una opcion valida");
			}
		} while(!salida);
	}
}
