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
				System.out.println("Introduce la contraseña de administrador: ");
				String entrada = lector.nextLine();
				if (entrada.equalsIgnoreCase(User.passAdmin)) {
					System.out.println("Introduce el nuevo usuario, y su correspondiente contraseña");
					String newuser= lector.nextLine();
					String newpass=lector.nextLine();
					listausers.añadirUser(new User(newuser,newpass));
				} else {
					System.out.println("No puede dar de alta a un usuario si no eres administrador");
				}
			}
		}

	}

	public void gestionEmpresas(ListaEmpresas empresas) {
		Scanner lector = new Scanner(System.in);
		boolean finbucle=false;
		boolean salida=false;
		String CIF;
		empresas = new ListaEmpresas();
		int opcion;
		System.out.println("Vamos  gestionar las Empresas guardadas");
		do {
			System.out.println("Indica que desea hacer:" +
					"\n1.- Listar las empresas guardadas" +
					"\n2.- Añadir empresas nuevas" +
					"\n3.- Actualizar datos de alguna empresa ya guardada (es necesario saber el CIF)" +
					"\n4.- Menu anterior.");
			opcion = lector.nextInt();
			lector.nextLine();
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
					lector.nextLine();
					System.out.println("Introduce la calle de la Empresa");
					String calle = lector.nextLine();
					System.out.println("Introduce el numero de la Empresa");
					int numero = lector.nextInt();
					lector.nextLine();
					System.out.println("Introduce el piso de la Empresa");
					String piso = lector.nextLine();
					System.out.println("Introduce la ciudad");
					ciudad = lector.nextLine();
					Direccion direccion = new Direccion(calle, numero, piso, ciudad);
					Empresa empresa = new Empresa(nombreEmpresa, CIF, telefono, direccion);
					empresas.añadirEmpresas(empresa);
					System.out.println("Empresa añadida correctamente...");
					break;
				case 3:
					System.out.println("Introduce el CIF de la empresa a modificar");
					CIF = lector.nextLine();
					empresas.actualizarEmpresa(CIF);
					System.out.println("Empresa actualizada correctamente...");
					break;
				case 4:
					System.out.println("Quiere volver al menu anterior?");
					String respuesta = lector.nextLine();
					if (respuesta.equalsIgnoreCase("si")) {
						finbucle = true;
						System.out.println("Volviendo al menu anterior...");
					}
					break;
				default:
					System.out.println("No ha seleccionado una opcion valida");
			}
		} while(!finbucle);
	}
}
