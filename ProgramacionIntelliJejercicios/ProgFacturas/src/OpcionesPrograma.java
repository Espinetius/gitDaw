import java.util.Scanner;

public class OpcionesPrograma {

	public void gestionEmpresas(ListaEmpresas empresas) {
		Scanner lector = new Scanner(System.in);
		String CIF;
		empresas = new ListaEmpresas();
		int opcion;
		System.out.println("Vamos  gestionar las Empresas guardadas" +
				"\nIndica que desea hacer:" +
				"\n1.- Listar las empresas guardadas" +
				"\n2.- Añadir empresas nuevas" +
				"\n3.- Actualizar datos de alguna empresa ya guardada (es necesario saber el CIF)");
		opcion=lector.nextInt();
		switch (opcion) {
			case 1:
				System.out.println("Has seleccionado listar empresas guardadas");
				empresas.imprimirFicheroNuevo();
				break;
			case 2:
				System.out.println("Ha seleccionado añadir empresas nuevas" +
						"\n.- Introduce los datos de la empresa a añadir");
				String nombreEmpresa;
				int telefono;
				String ciudad;
				System.out.println("Introduce el nombre de la Empresa");
				nombreEmpresa=lector.nextLine();
				System.out.println("Introduce el CIF");
				CIF = lector.nextLine();
				System.out.println("Introduce el telefono de la Empresa");
				telefono=lector.nextInt();
				System.out.println("Introduce la calle de la Empresa");
				String calle = lector.nextLine();
				System.out.println("Introduce el numero de la Empresa");
				int numero = lector.nextInt();
				System.out.println("Introduce el piso de la Empresa");
				String piso= lector.nextLine();
				System.out.println("Introduce la ciudad");
				ciudad=lector.nextLine();
				Empresa empresa = new Empresa(nombreEmpresa, CIF, telefono, new Direccion(calle, numero, piso, ciudad));
				System.out.println("Empresa añadida correctamente...");
				break;
			case 3:
				System.out.println("Introduce el CIF de la empresa a modificar");
				CIF=lector.nextLine();
				empresas.actualizarEmpresa();
		}
	}
}
