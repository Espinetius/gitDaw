import java.util.Scanner;

public class POO {
    public static Animal nuevoanimal() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce los siguientes datos del animal: nombre, color, edad, peso y si esta sano o no");
        String nombre = lector.nextLine();
        String color = lector.nextLine();
        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        boolean sano = lector.nextBoolean();
        return new Animal(nombre,color, edad, peso, sano);
    }
    public static Ejemplovaca dameVaca(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre, color, edad, peso, si da leche o no, y la calidad");
        String nombre = lector.nextLine();
        String color = lector.nextLine();
        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        boolean sano = lector.nextBoolean();

        boolean lechera = lector.nextBoolean();
        lector.nextLine();
        String calidad = lector.nextLine();
        return new Ejemplovaca(nombre, color, edad, peso, sano, lechera, calidad);
    }
    public static EjemploToro dameToro(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre, color, edad, peso, si es toreable y su brabura");
        String nombre = lector.nextLine();
        String color = lector.nextLine();
        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        boolean sano = lector.nextBoolean();
        boolean toreable = lector.nextBoolean();
        lector.nextLine();
        String brabura = lector.nextLine();
        return new EjemploToro(nombre, color, edad, peso, sano, toreable, brabura);
    }
    public static Ejemplocerdo damecerdo() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre, color, edad, peso, si esta sano y su raza");
        String nombre = lector.nextLine();
        String color = lector.nextLine();
        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        boolean sano = lector.nextBoolean();
        lector.nextLine();
        String raza = lector.nextLine();
        return new Ejemplocerdo(nombre, color, edad, peso, sano, raza);
    }
    public static void  main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean siganimal = true;
        int tiposanimal;
        do {
            System.out.println("Indica cuantos tipos de animal tiene en la granja");
            tiposanimal=lector.nextInt();
            Animal granja = nuevoanimal();
            System.out.println(nuevoanimal());



            System.out.println("Introduce el tipo de animal");
            String opcion = lector.nextLine();
            switch (opcion) {
                case "vaca":
                    Ejemplovaca nuevavaca = dameVaca();
                    System.out.println(nuevavaca.vacadefinida());

                    break;
                case "toro":
                    EjemploToro nuevoToro = dameToro();
                    System.out.println(nuevoToro.torodefinido());
                    break;
                case "cerdo":
                    Ejemplocerdo nuevoCerdo = damecerdo();
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
        } while(siganimal /*&& tiposanimal==Granja.getNumanimales()*/);
        System.out.println("cerrando...");
    }
}
