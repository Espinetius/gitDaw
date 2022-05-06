import java.util.Scanner;

public class OpcionesPrograma {

	public void gestionEmpresas() {
		Scanner lector = new Scanner(System.in);

		int opcion;
		System.out.println("Vamos  gestionar las Empresas guardadas" +
				"\nIndica que desea hacer:" +
				"\n1.- Listar las empresas guardadas" +
				"\n2.- Añadir empresas nuevas" +
				"\n3.- Actualizar datos de alguna empresa ya guardada (es necesario saber el nif)");
		opcion=lector.nextInt();
		switch (opcion) {
			case 1:

		}
	}
}
