import java.util.Scanner;

public class ControlEntrada {
    public static boolean controlSelecAnimal(int opcion) {
        boolean control = false;
        if (opcion>1 && opcion<7) {
            control=true;
        }
        return control;
    }
    // hay que hacer un control para cada tipo de variable NO DE CADA CLASE

}
