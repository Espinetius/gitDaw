import java.util.Scanner;

public class EntradaDatos {

        protected static int seleccionanimal() {
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
            return opcion;
        }
        public static Animal animales(int opcion) {
            Scanner lector = new Scanner(System.in);
            Animal animaldatos = null;
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado vaca.\nIntroduzca nombre, color, edad, peso, si esta sana si produce leche o no");
                    animaldatos = new Vaca(lector.next(), lector.next(), lector.nextInt(), lector.nextFloat(), lector.nextBoolean(), lector.nextBoolean());
                    break;
                case 2:
                    System.out.println("Ha seleccionado toro.\nIntroduzca nombre, color, edad, peso, si esta sana si es toreable y su nivel de brabura");
                    animaldatos = new Toro(lector.nextLine(), lector.nextLine(), lector.nextInt(), lector.nextFloat(), lector.nextBoolean(), lector.nextBoolean(), lector.nextLine());
                    break;
                case 3:
                    System.out.println("Ha seleccionado cerdo.\nIntroduzca nombre, color, edad, peso, si esta sana su raza");
                    animaldatos = new Cerdo(lector.nextLine(), lector.nextLine(), lector.nextInt(), lector.nextFloat(), lector.nextBoolean(), lector.nextLine());
                    break;
                case 4:
                    System.out.println("Ha seleccionado gallina.\nIntroduzca nombre, color, edad, peso, si esta sana y su raza");
                    animaldatos = new Gallina(lector.nextLine(), lector.nextLine(), lector.nextInt(), lector.nextFloat(), lector.nextBoolean(), lector.nextLine());
                    break;
                case 5:
                    System.out.println("Ha seleccionado conejo.\nIntroduzca nombre, color, edad, peso, si esta sana su raza y su estado si es domestico o no");
                    animaldatos = new Conejo(lector.nextLine(), lector.nextLine(), lector.nextInt(), lector.nextFloat(), lector.nextBoolean(),lector.nextLine(), lector.nextBoolean());
                    break;
                case 6:
                    System.out.println("Ha seleccionado pato.\nIntroduzca nombre, color, edad, peso, si esta sana su calidad y su genero");
                    animaldatos = new Pato(lector.nextLine(), lector.nextLine(), lector.nextInt(), lector.nextFloat(), lector.nextBoolean(),lector.nextLine(), lector.nextBoolean());
                    break;
                default:
                    System.out.println("No ha seleccionado ningun animal");
            }
            return animaldatos;
        }

}
