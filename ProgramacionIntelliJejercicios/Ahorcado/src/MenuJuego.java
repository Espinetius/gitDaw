import java.io.IOException;
import java.util.Scanner;

public class MenuJuego {
    public void juego() {
        Scanner lector = new Scanner(System.in);
        boolean descubierta = false;
        char letra;
        boolean again = false;
        String again2;
        do {
            System.out.println("....Que empiece el juego...." +
                    "\nSeleccione la dificultad:" +
                    "\n1. Palabra de 5 letras y 10 intentos" +
                    "\n2. Palabra de 6 letras y 8 intentos" +
                    "\n3. Palabra de 7 letras y 6 intentos" +
                    "\n4. Palabra personalizada");
            int opcion = lector.nextInt();
            Juego partida = new Juego(opcion);
            Diccionario palabra = new Diccionario(opcion);
            //System.out.println(palabra.getPalabra());
            System.out.println("Adivine la palabra: ");
            palabra.getPalabraoculta();
            do {
                System.out.println("\nIntroduce una letra");
                try {
                    letra = (char) System.in.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (palabra.palabra.equalsIgnoreCase(palabra.palabraOculta.toString())) {
                    descubierta = true;
                }
            } while (!descubierta && partida.vidas > 0);
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
    public void gestion() {
        Scanner lector = new Scanner(System.in);
        String palabra;
        int dificultad, opcion;
        Diccionario dicfacil = new Diccionario(1);
        Diccionario dicmedio = new Diccionario(2);
        Diccionario dicdificil = new Diccionario(3);
        boolean salida = false;
        do {
            System.out.println("Seleccione que desea hacer:" +
                    "\n1.- Listar diccionario" +
                    "\n2.- Actualizar diccionario" +
                    "\n3.- Menu anterior");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado listar el diccionario.");
                    dicfacil.listar();
                    dicmedio.listar();
                    dicdificil.listar();
                    break;
                case 2:
                    System.out.println("Ha seleccionado modificar el diccionario." +
                            "\nPrimero introduce la palabra que desea introducir y la dificultad");
                    palabra = lector.next();
                    dificultad = lector.nextInt();
                    switch (dificultad) {
                        case 1:
                            dicfacil.actualizarPalabras(palabra, dificultad);
                            break;
                        case 2:
                            dicmedio.actualizarPalabras(palabra, dificultad);
                            break;
                        case 3:
                            dicdificil.actualizarPalabras(palabra, dificultad);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Volviendo al menu anterior");
                    salida = true;
                    break;
            }
        } while (!salida);
    }
}
