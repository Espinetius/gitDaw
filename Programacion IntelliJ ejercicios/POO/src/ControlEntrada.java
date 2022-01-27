import java.util.Scanner;

public class ControlEntrada extends  EntradaDatos{
    public int numopcion() {
        Scanner lector = new Scanner(System.in);
        int numopcion = EntradaDatos.seleccionanimal();
        while (EntradaDatos.seleccionanimal() > 1 && EntradaDatos.seleccionanimal() < 6){
            System.out.println("Seleccione una opcion entre 1 y 6");
            numopcion = lector.nextInt();
        }
        return numopcion;
    }
}
