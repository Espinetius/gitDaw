import java.util.Objects;
import java.util.Scanner;

public class POO {
    public static ejemplovaca damevaca(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre, color, edad, peso, si da leche o no, y la calidad");
        String nombre = lector.nextLine();
        String color = lector.nextLine();
        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        boolean lechera = lector.nextBoolean();
        lector.nextLine();
        String calidad = lector.nextLine();
        ejemplovaca nuevavaca = new ejemplovaca(nombre, color, edad, peso, lechera, calidad);
        return nuevavaca;
    }
    public static ejemploToro dameToro(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre, color, edad, peso, si es toreable y su brabura");
        String nombre = lector.nextLine();
        String color = lector.nextLine();
        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        boolean toreable = lector.nextBoolean();
        lector.nextLine();
        String brabura = lector.nextLine();
        ejemploToro nuevoToro = new ejemploToro(nombre, color, edad, peso, toreable, brabura);
        return nuevoToro;
    }
    public static ejemplocerdo damecerdo() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre, color, edad, peso, si esta sano y su raza");
        String nombre = lector.nextLine();
        String color = lector.nextLine();
        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        boolean sano = lector.nextBoolean();
        lector.nextLine();
        String raza = lector.nextLine();
        ejemplocerdo nuevoCerdo = new ejemplocerdo(nombre, color, edad, peso, sano, raza);
        return nuevoCerdo;
    }
    public static void  main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean siganimal = true;
        do {
            System.out.println("Introduce el tipo de animal");
            String opcion = lector.nextLine();
            switch (opcion) {
                case "vaca":
                    ejemplovaca nuevavaca = damevaca();
                    System.out.println(nuevavaca.vacadefinida());
                    break;
                case "toro":
                    ejemploToro nuevoToro = dameToro();
                    System.out.println(nuevoToro.torodefinido());
                    break;
                case "cerdo":
                    ejemplocerdo nuevoCerdo = damecerdo();
                    System.out.println(nuevoCerdo.cerdodefinido());
                    break;
                default:
                    System.out.println("No ha introducido un animal valido");
            }
            System.out.println("Quieres meter otro animal? Responda si o no.");
            String respuesta = lector.nextLine();
            while (!(respuesta.equals("no") || respuesta.equals("si"))) {
                System.out.println("responda si o no");
                respuesta = lector.nextLine();
            }
            if (respuesta.equals("no")) {
                siganimal=false;
            }
        } while(siganimal);
        System.out.println("cerrando...");
    }
}
