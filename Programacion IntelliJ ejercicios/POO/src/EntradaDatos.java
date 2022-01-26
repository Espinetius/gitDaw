import java.util.Scanner;

public class EntradaDatos {
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
    public static Vaca dameVaca(){
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
        return new Vaca(nombre, color, edad, peso, sano, lechera, calidad);
    }
    public static Toro dameToro(){
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
        return new Toro(nombre, color, edad, peso, sano, toreable, brabura);
    }
    public static Cerdo damecerdo() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre, color, edad, peso, si esta sano y su raza");
        String nombre = lector.nextLine();
        String color = lector.nextLine();
        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        boolean sano = lector.nextBoolean();
        lector.nextLine();
        String raza = lector.nextLine();
        return new Cerdo(nombre, color, edad, peso, sano, raza);
    }

}
