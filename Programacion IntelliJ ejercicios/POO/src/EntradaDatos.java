import java.sql.Array;
import java.util.Scanner;

public class EntradaDatos {
        protected static void menuPrincipal(Granja granja){
            Scanner lector = new Scanner(System.in);
            String respuesta="si";
            int opcionmenu;
            System.out.println("Bienvenido a la granja " +Granja.granja+".");
            do {
                System.out.println("\nSeleccione la opcion que desea realizar:" +
                        "\n1.Introducir animal." +
                        "\n2.Eliminar animal." +
                        "\n3.Ver lista de animales." +
                        "\n4.Salir del programa.");
                opcionmenu = lector.nextInt();
                switch (opcionmenu) {
                    case 1:
                        if (granja.hayHueco())
                            granja.altaAnimal(animales(seleccionanimal()));
                        else
                            System.out.println("No hay hueco");
                        break;
                    case 2:
                        break;
                    case 3:

                        break;
                    case 4:
                        System.out.println("Muchas gracias por usar el programa");
                        respuesta="no";
                        break;
                }
                if (opcionmenu!=4) {
                    lector.nextLine();
                    System.out.println("Desea introducir otro animal?");
                    respuesta = lector.nextLine();
                }
                } while (ControlEntrada.nextanimal(respuesta)&&opcionmenu==4);
            System.out.println("cerrando ...");

        }

        protected static int seleccionanimal() {
            Scanner lector = new Scanner(System.in);
            int opcion;
            System.out.println("Seleccione un animal del menu para introducirlo:" +
                    "\n1.Vaca" +
                    "\n2.Toro" +
                    "\n3.Cerdo" +
                    "\n4.Gallina" +
                    "\n5.Conejo" +
                    "\n6.Pato" +
                    "\n7.Oveja");
            opcion = lector.nextInt();
            while (ControlEntrada.controlSelecAnimal(opcion)) {
                System.out.println("Introduzca un valor entre 1 y 7");
                opcion = lector.nextInt();
            }
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
                case 7:
                    System.out.println("Ha seleccionado oveja.\nIntroduzca nombre, color, edad, peso, si esta sana, si da lana, si da queso y su localidad");
                    animaldatos = new Oveja(lector.nextLine(), lector.nextLine(), lector.nextInt(), lector.nextFloat(), lector.nextBoolean(), lector.nextBoolean(), lector.nextBoolean(), lector.nextLine());
                    break;
                default:
                    System.out.println("No ha seleccionado ningun animal");
            }
            return animaldatos;
        }
        /*
        public static Granja arrayanimales(){
            Scanner lector = new Scanner(System.in);
            System.out.println("Cuantos animales va a tener su granja?");
            int totalanimales = lector.nextInt();
            return new Granja(totalanimales);
        }

         */

}
