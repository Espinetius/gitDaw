import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuJuego {
    /**
     * Metodo que da aceso a la primera parte del menu del juego
     * @param diccionariopalabras
     */
    public void juego(Diccionario diccionariopalabras) throws ExepcionPropia{
        Scanner lector = new Scanner(System.in);
        Juego partida;
        int dificultad;
        boolean again = false;
        String again2 = null;
        String entrada=null;
        do {
            System.out.println("....Que empiece el juego....");
            System.out.println("Introduzca dificultad. Introduzca 0 para una dificultad aleatoria.");
            dificultad = lector.nextInt();
            lector.nextLine();
            /*
            partida = new Juego(diccionariopalabras);
            do {
                //System.out.println(palabra.getPalabra());
                System.out.println("Adivine la palabra: ");
                partida.mosstrarGuiones();
                System.out.println("Introduce una letra");
                try {
                    entrada = lector.nextLine();
                    partida.comprobarResultado(entrada);
                    partida.vidasRestantes(entrada);
                    partida.pintarMuñeco(partida.vidas);
                    partida.finalJuego();
                } catch (InputMismatchException ex) {
                    ex.getMessage();
                }
            } while (!partida.end);
            System.out.println("Quiere volver a jugar? si/no");
             */
            if (dificultad==0) {
                partida = new Juego(diccionariopalabras);
                do {
                    //System.out.println(palabra.getPalabra());
                    System.out.println("Adivine la palabra: ");
                    partida.mosstrarGuiones();
                    System.out.println("Introduce una letra");
                    try {
                        entrada = lector.nextLine();
                        partida.comprobarResultado(entrada);
                        partida.vidasRestantes(entrada);
                        partida.pintarMuñeco(partida.vidas);
                        partida.finalJuego();
                    } catch (InputMismatchException ex) {
                        ex.getMessage();
                    }
                } while (!partida.end);
                System.out.println("Quiere volver a jugar? si/no");
            } else {
                try {
                    Testing.diffNull(dificultad);
                } catch (InputMismatchException e) {
                    Testing.diffNull(dificultad);
                }
                partida= new Juego(diccionariopalabras, dificultad);
                do {
                    //System.out.println(palabra.getPalabra());
                    System.out.println("Adivine la palabra: ");
                    partida.mosstrarGuiones();
                    System.out.println("Introduce una letra");
                    try {
                        entrada = lector.nextLine();
                        partida.comprobarResultado(entrada);
                        partida.vidasRestantes(entrada);
                        partida.pintarMuñeco(partida.vidas);
                        partida.finalJuego();
                    } catch (InputMismatchException ex) {
                        ex.getMessage();
                    }
                } while (!partida.end);
                System.out.println("Quiere volver a jugar? si/no");
            }
            try {
                again2=lector.nextLine();
                if (again2.equalsIgnoreCase("no")) {
                    again = true;
                }
            } catch (InputMismatchException ex) {
                ex.getMessage();
            }
        } while (!again);
    }

    /**
     * Metodo que da acceso a la segunda parte del menu del juego
     * @param diccionariopalabras
     */
    public void gestion(Diccionario diccionariopalabras) {
        Scanner lector = new Scanner(System.in);
        int  opcion=4;
        Diccionario dic = diccionariopalabras;
        boolean salida = false;
        do {
            System.out.println("Seleccione que desea hacer:" +
                    "\n1.- Listar diccionario" +
                    "\n2.- Actualizar diccionario" +
                    "\n3.- Menu anterior");
            try{
                opcion = lector.nextInt();
                lector.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Ha seleccionado listar el diccionario.");
                        Diccionario.imprimirFichero();
                        break;
                    case 2:
                        System.out.println("Ha seleccionado modificar el diccionario." +
                                "\n.- Introduzca una palabra");
                        dic.añadirLineas(new Linea(lector.nextLine()));
                        break;
                    case 3:
                        System.out.println("Volviendo al menu anterior");
                        salida = true;
                        break;
                    default:
                        System.out.println("No ha seleccionado una opcion valida del menu.");
                }
            } catch (InputMismatchException ex){
                ex.getMessage();
            }
        } while (!salida);
    }
}
