import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EntradaDatos {
    protected  static  int numeanimales() {
        Scanner lector = new Scanner(System.in);
        int numanimales;
        System.out.println("Bienvenido a la granja " +Granja.granja+".");
        System.out.println("Introduzca el numero de animales totales que tendra su granja:");
        numanimales= lector.nextInt();
        return numanimales;
    }
        protected static void menuPrincipal(Granja granja){
            boolean salida=false;
            Scanner lector = new Scanner(System.in);
            String respuesta="si";
            int opcionmenu;
            int contadorAnimales=0;
            int contadorEspacios=0;
            do {
                System.out.println("\nSeleccione la opcion que desea realizar:" +
                        "\n1.Introducir animal." +
                        "\n2.Eliminar animal. " +
                        "\n3.Lista de animales." +
                        "\n4.Listar animales que cumplan dos requisitos indicados por el usuario" +
                        "\n5.Listar solo los animales del tipo indicado por el usuario." +
                        "\n6.Modificar algún atributo general de un animal identificado por nombre" +
                        "\n8.Modificar un atributo específico de algún animal" +
                        "\n9.Salir del programa.");
                opcionmenu = lector.nextInt();
                lector.nextLine();
                switch (opcionmenu) {
                    case 1:
                        if (granja.hayHueco())
                            granja.altaAnimal(animales(seleccionanimal()));
                        else
                            System.out.println("No hay hueco");
                        break;
                    case 2:
                        int numanimal;
                        System.out.println("A continuacion se le dara la lista de animales para que escoja al que quiere dar de baja.");
                        for (int i = 0; i < Granja.animales.length; i++) {
                            if (Granja.animales[i]!=null) {
                                System.out.println(Granja.animales[i]);
                                contadorAnimales++;
                            } else {
                                contadorEspacios++;
                            }
                        }
                        if(contadorEspacios!=0) {
                            System.out.println("Tienes " + contadorAnimales + " animales y " + contadorEspacios + " espacios aun para mas animales");
                        } else {
                            System.out.println("La granja esta llena");
                        }
                        System.out.println("Que numero de animal quieres dar de baja?");
                        numanimal=lector.nextInt()-1;
                        granja.bajaAnimal(numanimal);
                        break;
                    case 3:
                        System.out.println("A continuacion se muestra la lista de los animales que tiene:");
                        for (int i = 0; i < Granja.animales.length; i++) {
                            if (Granja.animales[i] != null) {
                                System.out.println(Granja.animales[i]);
                                contadorAnimales++;
                            } else {
                                contadorEspacios++;
                            }
                        }
                        if(contadorEspacios!=0) {
                            System.out.println("Tienes " + contadorAnimales + " animales y " + contadorEspacios + " espacios aun para mas animales");
                        } else {
                            System.out.println("La granja esta llena");
                        }
                        break;
                    case 4:
                        System.out.println("Indique dos identificativos para la busqueda de los animales.");
                        String iden1=lector.nextLine();
                        String iden2=lector.nextLine();
                        System.out.println("A continuacion se muestra la lista de los animales que tienen esos identificativos:");
                        for (int i = 0; i < Granja.animales.length; i++) {
                            if (Granja.animales[i] != null) {
                            switch (iden1) {
                                case 
                                        Granja.animales[i].getClass().getName().equalsIgnoreCase(iden1):
                                    System.out.println(Granja.animales[i]);
                                }
                            }
                        }
                        }
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        System.out.println("Muchas gracias por usar el programa");
                        respuesta="no";
                        salida = true;
                        break;
                }
                /*if (opcionmenu!=4) {
                    lector.nextLine();
                    System.out.println("Desea introducir otro animal?");
                    respuesta = lector.nextLine();
                    ControlEntrada.nextanimal(respuesta);
                }
                 */
                if (opcionmenu!=9) {
                    lector.nextLine();
                    System.out.println("Desea continuar?");
                    respuesta = lector.nextLine();
                    if (respuesta.equals("no")) {
                        salida=true;
                    }
                }
                } while (!salida);
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
                    animaldatos = new Vaca(lector.next(), lector.next(), lector.nextInt(), lector.nextFloat(), lector.nextBoolean());
                    break;
                case 2:
                    System.out.println("Ha seleccionado toro.\nIntroduzca nombre, color, edad, peso, si esta sana si es toreable y su nivel de brabura");
                    animaldatos = new Toro(lector.nextLine(), lector.nextLine(), lector.nextInt(), lector.nextFloat(), lector.nextBoolean(), lector.nextLine());
                    break;
                case 3:
                    System.out.println("Ha seleccionado cerdo.\nIntroduzca nombre, color, edad, peso, si esta sana su raza");
                    animaldatos = new Cerdo(lector.nextLine(), lector.nextLine(), lector.nextInt(), lector.nextFloat(), lector.nextLine());
                    break;
                case 4:
                    System.out.println("Ha seleccionado gallina.\nIntroduzca nombre, color, edad, peso, si esta sana y su raza");
                    animaldatos = new Gallina(lector.nextLine(), lector.nextLine(), lector.nextInt(), lector.nextFloat(), lector.nextLine());
                    break;
                case 5:
                    System.out.println("Ha seleccionado conejo.\nIntroduzca nombre, color, edad, peso, si esta sana su raza y su estado si es domestico o no");
                    animaldatos = new Conejo(lector.nextLine(), lector.nextLine(), lector.nextInt(), lector.nextFloat(),lector.nextLine(), lector.nextBoolean());
                    break;
                case 6:
                    System.out.println("Ha seleccionado pato.\nIntroduzca nombre, color, edad, peso, si esta sana su calidad y su genero");
                    animaldatos = new Pato(lector.nextLine(), lector.nextLine(), lector.nextInt(), lector.nextFloat(),lector.nextLine(), lector.nextBoolean());
                    break;
                case 7:
                    System.out.println("Ha seleccionado oveja.\nIntroduzca nombre, color, edad, peso, si esta sana, si da lana, si da queso y su localidad");
                    animaldatos = new Oveja(lector.nextLine(), lector.nextLine(), lector.nextInt(), lector.nextFloat(), lector.nextBoolean(), lector.nextBoolean(), lector.nextLine());
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
