import java.util.Scanner;

public class EntradaDatos extends Animal{

        public static Animal animales() {
            Scanner lector = new Scanner(System.in);
            int opcion;
            System.out.println("Bienvenido a la granja " + Granja.granja +
                    "\nSeleccione un animal del menu para introducirlo:" +
                    "\n1.Vaca" +
                    "\n2.Toro" +
                    "\n3.Cerdo" +
                    "\n4.Gallina" +
                    "\n5.Conejo" +
                    "\n6.Pato");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado vaca.\nIntroduzca nombre, color, edad, peso, si esta sana y si produce leche");
                    Vaca animaldatos = new Vaca(
                            lector.nextLine(),
                            lector.nextLine(),
                            lector.nextInt(),
                            lector.nextFloat(),
                            lector.nextBoolean(),
                            lector.nextBoolean()
                    );


            }

            return animaldatos;
        }
}
