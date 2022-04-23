import java.io.IOException;
import java.util.Scanner;

public class MenuJuego {
    public void juego(Diccionario diccionariopalabras) {
        Scanner lector = new Scanner(System.in);
        boolean descubierta = false;
        char letra;
        boolean again = false;
        String again2;
        do {
            System.out.println("....Que empiece el juego....");
            Juego partida = new Juego(diccionariopalabras);
            //System.out.println(palabra.getPalabra());
            System.out.println("Adivine la palabra: ");

            if (descubierta) {
                System.out.println("Enhorabuena! Has ganado la partida. Gracias por jugar");
            }
            if (partida.vidas == 0) {
                System.out.println("Has perdido el juego. Gracias por jugar");
            }
            System.out.println("Quiere volver a jugar? si/no");
            again2=lector.nextLine();
            if (again2.equalsIgnoreCase("no")) {
                again = true;
            }
        } while (!again);
    }
    public void gestion(Diccionario diccionariopalabras) {
        Scanner lector = new Scanner(System.in);
        int  opcion;
        Diccionario dic = diccionariopalabras;
        boolean salida = false;
        do {
            System.out.println("Seleccione que desea hacer:" +
                    "\n1.- Listar diccionario" +
                    "\n2.- Actualizar diccionario" +
                    "\n3.- Menu anterior");
            opcion = lector.nextInt();
            lector.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado listar el diccionario.");
                    dic.imprimirFichero();
                    break;
                case 2:
                    System.out.println("Ha seleccionado modificar el diccionario." +
                            "\n.- Introduzca una palabra" +
                            "\n.- Introduzca la dificultad de la palabra");
                    dic.añadirLineas(new Linea(lector.nextLine(),lector.nextInt()));
                    break;
                case 3:
                    System.out.println("Volviendo al menu anterior");
                    salida = true;
                    break;
                default:
                    System.out.println("No ha seleccionado una opcion valida del menu.");
            }
        } while (!salida);
    }
}
