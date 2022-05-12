import java.util.Scanner;

public class OpcionesPrograma {
	public void logPrincipal(ListaUsuarios listausers) {
		Scanner lector = new Scanner(System.in);
		listausers=new ListaUsuarios();
		System.out.println("Introduce el usuario");
		String user = lector.nextLine();
		if(listausers.login(user)) {
			System.out.println("Bienvenido...");
		} else {
			System.out.println("El usuario indicado no existe." +
					"\nQuiere dar de alta un nuevo usuario?");
			String respuesta = lector.nextLine();
			if (respuesta.equalsIgnoreCase("si")) {

			}
		}

	}

	public void gestionEmpresas(ListaEmpresas empresas) {
		Scanner lector = new Scanner(System.in);
		boolean finbucle=false;
		String CIF;
		empresas = new ListaEmpresas();
		int opcion;
		System.out.println("Vamos  gestionar las Empresas guardadas");
		do {
			System.out.println("Indica que desea hacer:" +
					"\n1.- Listar las empresas guardadas" +
					"\n2.- Añadir empresas nuevas" +
					"\n3.- Actualizar datos de alguna empresa ya guardada (es necesario saber el CIF)");
			opcion = lector.nextInt();
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
					nombreEmpresa = lector.nextLine();
					System.out.println("Introduce el CIF");
					CIF = lector.nextLine();
					System.out.println("Introduce el telefono de la Empresa");
					telefono = lector.nextInt();
					System.out.println("Introduce la calle de la Empresa");
					String calle = lector.nextLine();
					System.out.println("Introduce el numero de la Empresa");
					int numero = lector.nextInt();
					System.out.println("Introduce el piso de la Empresa");
					String piso = lector.nextLine();
					System.out.println("Introduce la ciudad");
					ciudad = lector.nextLine();
					Empresa empresa = new Empresa(nombreEmpresa, CIF, telefono, new Direccion(calle, numero, piso, ciudad));
					System.out.println("Empresa añadida correctamente...");
					break;
				case 3:
					System.out.println("Introduce el CIF de la empresa a modificar");
					CIF = lector.nextLine();
					empresas.actualizarEmpresa(CIF);
					System.out.println("Empresa actualizada correctamente...");
					break;

				default:
					System.out.println("No ha seleccionado una opcion valida");
			}
			System.out.println("Quiere seguir gestionando empresas?");
			String respuesta=lector.nextLine();
			if (respuesta.equalsIgnoreCase("no")) {
				finbucle=true;
			}
		} while(!finbucle);
	}
}
