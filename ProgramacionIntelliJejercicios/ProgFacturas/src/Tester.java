import java.util.Scanner;

public class Tester {
	public static void main(String args[]){
		int opcion;
		boolean salida=false;
		Scanner lector = new Scanner(System.in);
		OpcionesPrograma menu = new OpcionesPrograma();
		ListaUsuarios lista = new ListaUsuarios();
		ListaEmpresas listaEmpresas = new ListaEmpresas();
		System.out.println("" +"----------------------------------------------------------------------------------------------------" +
				"\n						Bienvenido al Programa de facturacion Tresgon29." +
                "\n----------------------------------------------------------------------------------------------------" +
				"\nDebe identificarse para continuar....");
		menu.logPrincipal(lista);
		do {
			System.out.println("Seleccione que desea hacer:" +
					"\n0.- Cambiar de usuario." +
					"\n1.- Gestion de empresas." +
					"\n2.- Facturacion." +
					"\n3.- Cerrar Programa.");
			opcion=lector.nextInt();
			lector.nextLine();
			switch (opcion) {
				case 0:
					menu.logPrincipal(lista);
					break;
				case 1:
					menu.gestionEmpresas(listaEmpresas);
					break;
				case 2:
					menu.facturacion(listaEmpresas);
					break;
				case 3:
					System.out.println("Gracias por usar el programa." +
							"\n" +
							"\n SALIENDO...");
					salida=true;
					break;
				default:
					System.out.println("No ha seleccionado una opcion valida...");
			}
		} while(!salida);
	}
}
