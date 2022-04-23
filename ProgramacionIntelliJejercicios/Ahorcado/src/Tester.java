import java.io.IOException;
import java.util.Scanner;

public class Tester {
	public static void main (String arg[]) throws IOException {
		Scanner lector = new Scanner(System.in);
		int opcion;
		String pass="palomeras";
		String contraseña=null;
		boolean salida = false;
		Diccionario diccionariopalabras = new Diccionario();
		MenuJuego juego = new MenuJuego();
			System.out.println("Bienvenido al juego del ahorcado. Seleccione una opcion de la lista:" +
					"\n1. Jugar." +
					"\n2. Gestionar diccionarios" +
					"\n3. Salir");
			switch (opcion = lector.nextInt()) {
				case 1:
					juego.juego(diccionariopalabras);
					break;
				case 2:
					System.out.println("Introduzca la contraseña");
					String limpieza= lector.nextLine();
					contraseña = lector.nextLine();
					int i=1;
					while (contraseña==null || !contraseña.equals(pass)) {
						if(i>=3) {
							System.out.println("Recuerda, la contraseña es: 'palomeras'");
						}
						System.out.println("Introduzca la contraseña correcta");
						contraseña=lector.nextLine();
						i++;
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

	}
}
