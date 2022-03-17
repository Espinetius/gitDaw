
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prog
 */
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salida = false;
        int numcentros;
        Scanner lector = new Scanner(System.in); 
        System.out.println("Bienvenido, primero seleccione cuantos huecos de centro desea, se registraran la mitad");
        numcentros=lector.nextInt();
        Empresa emp = new Empresa(numcentros);  
        do {
            System.out.println("Seleccione una opcion del menu a realizar:"
                    + "\n1.Listado Centros de Ocio."
                    + "\n2.Añadir Centro de Ocio"
                    + "\n3.Consultar Centros de ocio (por provincia y año)"
                    + "\n4.Actualizar Edad minima"
                    + "\5.Actualizar delfinario zoo"
                    + "\n6.Eliminar centro de ocio (por provincia y año)"
                    + "\n7.Calcular precio"
                    + "\n8.Mostrar los centros de una determinada provincia"
                    + "\n9.Cerrar programa");
            int opcion=lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado Listar centros de ocio");
                    emp.listarCentros();
                    break;
                case 2:
                    System.out.println("Ha seleccionado Añadir centro de ocio. Primero se vera si hay espacio, y en ese caso se creara.");
                    emp.hayHueco();
                    
                    break;
                case 3:
                    System.out.println("Ha seleccionado Consultar Centros de ocio por provincia y año");
                    System.out.println("Introduzca la provincia y dos añós");
                    
                    emp.consulta(lector.next(), lector.nextInt(), lector.nextInt());
                    
                    break;
                case 4:
                    System.out.println("Ha seleccionado Actualizar edad min"
                            + "\nIntroduzca el id del centro y la nueva edad.");
                    emp.actEdadmin(lector.nextInt(), lector.nextInt());
                    
                    break;
                case 5:
                    System.out.println("Ha seleccionado Actualizar delfinario"
                            + "\nIntroduzca el id y true para si o false para no");
                    emp.actDelfinario(lector.nextInt(), lector.nextBoolean());
                   
                    break;
                case 6:
                    System.out.println("Ha seleccionado eliminar centro."
                            + "\nIntroduzca la provincia y el año");
                    emp.eliminarCentro(lector.nextLine(), lector.nextInt());
                    
                    break;
                case 7:
                    System.out.println("Ha selccionado calcular precio de un usuario de 20 años y en dia laboral.");
                    int edad = 20;
                    boolean festivo = false;
                    emp.precioReal(edad, festivo);
                    
                    break;
                case 8:
                    System.out.println("Ha seleccionado listar los centros de la misma provincia"
                            + "\nIntroduzca la provincia.");
                    emp.listaCentroOrd(lector.nextLine());
                    
                    break;
                case 9:
                    System.out.println("Cerrando programa...");
                    salida=true;
            }
        }while (!salida);
        
    }
    
}
