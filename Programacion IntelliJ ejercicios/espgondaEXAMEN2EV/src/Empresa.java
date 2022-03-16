
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
public class Empresa {
    protected CentroOcio centro[];
    public Empresa() {
        this(10);
    }
    public Empresa(int numcentros) {
        centro = new CentroOcio[numcentros];
        for (int i = 0; i < centro.length/2; i++) {
            if(i%2!=0) {
                centro[i]= new ParqueAtracciones();
            } else {
                centro[i]= new Zoologico();
            }
        }
    }
    public void listarCentros() {
        for (int i = 0; i < centro.length; i++) {
            if (centro[i]!=null) {
                    System.out.println(centro[i]);
            }
        }
    }
    public boolean hayHueco() {
        Scanner lector = new Scanner(System.in);
        int opcion;
        boolean salida = false;
        boolean respuesta =false;
        for (int i = 0; i < centro.length && !salida; i++) {
            if(centro[i]==null) {
                respuesta=true;
                System.out.println("Hay hueco para registro. Elija entre parque(1) o zoo(2)");
                opcion = lector.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Ha seleccionado parque de atracciones:"
                                    + "\n Introduduzca el id, nombre, entrada, provincia, el año de construccion y la edad minima");
                            centro[i]=new ParqueAtracciones(lector.nextInt(),lector.next(), lector.nextDouble(), lector.next(), lector.nextInt(), lector.nextInt());
                            break;
                        case 2:
                            System.out.println("Ha seleccionado zoo:"
                                    + "\n Introduzca el id, nombre, entrada, provincia, el año de construccion si tiene delfines y si tiene pinguinos");
                            centro[i]=new Zoologico(lector.nextInt(),lector.next(), lector.nextDouble(), lector.next(), lector.nextInt(), lector.nextBoolean(), lector.nextBoolean());
                            break;
                        default:
                            System.out.println("No ha seleccionado ninguna opcion valida...");
                            break;
                    }
                salida = true;    
            }
        }
        return respuesta;
    }
    public void consulta(String prov, int anyo1, int anyo2) {
        int aux;
        if (anyo1>anyo2) {
            aux=anyo1;
            anyo1=anyo2;
            anyo2=aux;
        }
        for (int i = 0; i < centro.length; i++) {
            if (centro[i].getProvincia().localidad.equalsIgnoreCase(prov) && centro[i].getAnyoConstruccion()>anyo1 && centro[i].getAnyoConstruccion()<anyo1 ) {
                System.out.println(centro[i]);
            }
        }
    }
    public void actEdadmin(int id, int edad) {
        for (int i = 0; i < centro.length; i++) {
            if (centro[i].getIdentificador()==id && centro[i].getClass().getSimpleName().equalsIgnoreCase("ParqueAtracciones")) { 
                centro[i] = new ParqueAtracciones(edad);
            }
        }
    }
    public void actDelfinario(int id, boolean delfinario) {
         for (int i = 0; i < centro.length; i++) {
            if (centro[i].getIdentificador()==id && centro[i].getClass().getSimpleName().equalsIgnoreCase("Zoologico")) { 
                centro[i] = new Zoologico(delfinario);
            }
        }
    }
    public void eliminarCentro(String prov, int anyo){
        for (int i = 0; i < centro.length; i++) {
            if (centro[i].getProvincia().localidad.equalsIgnoreCase(prov) && centro[i].getAnyoConstruccion()==anyo) {
                centro[i]=null;    
            }
        }
    }
    public void precioReal (int edad, boolean festivo) {
        for (int i = 0; i < centro.length; i++) {
            System.out.println(centro[i].PrecioReal(20, false));
        }
    }
    public void listaCentroOrd(String prov) {
        for (int i = 0; i < centro.length; i++) {
            if(centro[i].getNombre().charAt(0)==prov.charAt(0)){
                System.out.println(centro[i]);
            }
        }
    }
    
}
