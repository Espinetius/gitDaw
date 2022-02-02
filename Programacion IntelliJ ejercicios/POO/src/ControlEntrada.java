import java.util.Scanner;

public class ControlEntrada {
    public static boolean controlSelecAnimal(int opcion) {
        boolean control = false;
        if (opcion<0 && opcion>8) {
            control=true;
        }
        return control;
    }
    /*public static boolean nextanimal(String respuesta) {
        boolean nextanimal = true;
        respuesta
        if (respuesta.equalsIgnoreCase("no")) {
            nextanimal=false;
        }
        return nextanimal;
    }

     */
    // hay que hacer un control para cada tipo de variable NO DE CADA CLASE

}
