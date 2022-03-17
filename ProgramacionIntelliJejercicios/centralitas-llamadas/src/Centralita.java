import java.util.Scanner;

public class Centralita {
    public static int settiempo() {
        Scanner lector = new Scanner(System.in);
        int tiempo;
        System.out.println("Cuanto ha durado la llamada?");
        tiempo = lector.nextInt();
        return tiempo;
    }


    public static void main(String Args[]){
        Scanner lector = new Scanner(System.in);
        int tiempo;
        int opcion;
        double coste;

        do {
            System.out.println("Seleccione si ha sido local (1), provincial (2) o 3 para salir");
            opcion = lector.nextInt();
            Llamadas llamadas = new Llamadas();
            //llamadas.infollamadas();
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado local");
                    settiempo();
                    llamadas.preciollamadas();
                    break;
                case 2:
                    System.out.println("Ha seleccionado provincical");
                    settiempo();
                    System.out.println(llamadas);;
                    break;
                case 3:
                    System.out.println("cerrando...");
            }
        }while (opcion!=3);
        }

    }
