import java.util.Scanner;

public class POO {
    public static void  main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean siganimal = true;
        int tiposanimal;
        do {
            //intento de arrancar con arrays
            /*
            System.out.println("Indica cuantos tipos de animal tiene en la granja");
            tiposanimal=lector.nextInt();
            Animal granja = EntradaDatos.nuevoanimal();
            System.out.println();

             */
            Vaca vaca1 = new Vaca("pepa","verde", 5,40,true,true,"alta");
            System.out.println(vaca1);
            //animal por animal
            /*
            System.out.println("Introduce el tipo de animal");
            String opcion = lector.nextLine();
            switch (opcion) {
                case "vaca":
                    Ejemplovaca nuevavaca = EntradaDatos.dameVaca();
                    System.out.println(nuevavaca.vacadefinida());
                    break;
                case "toro":
                    EjemploToro nuevoToro = EntradaDatos.dameToro();
                    System.out.println(nuevoToro.torodefinido());
                    break;
                case "cerdo":
                    Ejemplocerdo nuevoCerdo = EntradaDatos.damecerdo();
                    System.out.println(nuevoCerdo.cerdodefinido());
                    break;
                default:
                    System.out.println("No ha introducido un animal valido");
            }
             */
            System.out.println("Quieres meter otro animal? Responda si o no.");
            String respuesta = lector.nextLine();
            while (!(respuesta.equals("no") || respuesta.equals("si"))) {
                System.out.println("responda si o no");
                respuesta = lector.nextLine();
            }
            if (respuesta.equals("no")) {
                siganimal=false;
            }
        } while(siganimal /*&& tiposanimal==Animal.getNumanimales()*/);
        System.out.println("cerrando...");
    }
}
