import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaEmpresas {
	protected ArrayList<Empresa> empresasArraylist;
	protected static final String ficheroListaEmpresas = "Listado_Empresas.txt";
	public ListaEmpresas() {
		empresasArraylist = new ArrayList<>();
		empresasArraylist.add(new Empresa("...Empresa...","...CIF..."));
		empresasArraylist.add(new Empresa("----------------------------------------", "------------------"));
		comprobarFichero();
	}
	public static void comprobarFichero() {
		File ficheroListaEmpresas = new File("Listado_Empresas.txt");
		if (!ficheroListaEmpresas.exists()) {
			try {
				ficheroListaEmpresas.createNewFile();
				imprimirFichero();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public  void imprimirFicheroNuevo() {
		try {
			comprobarFichero();
			PrintWriter pw = new PrintWriter(new File(ficheroListaEmpresas));
			System.out.println("Las empresas son: (nombre empresa, CIF, telefono, ciudad)");
			for (int i = 0; i < empresasArraylist.size(); i++) {
				pw.println(empresasArraylist.get(i));
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void imprimirFichero() {
		Scanner lector = null;
		try {
			comprobarFichero();
			lector = new Scanner(new File(ficheroListaEmpresas));
			while(lector.hasNextLine()){
				System.out.println(lector.nextLine());
			}
			lector.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	public void añadirEmpresas(Empresa empresa) {
		boolean salida=false;
		try {
			comprobarFichero();
			PrintWriter pw = new PrintWriter(new FileWriter(ficheroListaEmpresas, true));
			for (int i = 0; i < empresasArraylist.size() && !salida; i++) {
				if (!empresa.CIF.equalsIgnoreCase(empresasArraylist.get(i).CIF)){
					salida=true;
				}
			}
			if (salida) {
				pw.println(empresa);
			} else {
				System.out.println("Esa Empresa ya estaba añadida.");
			}
			pw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public void actualizarEmpresa(String CIF) {
		Scanner lector = new Scanner(System.in);
		boolean salida=false;
		try {
			comprobarFichero();
			PrintWriter pw = new PrintWriter(new FileWriter(ficheroListaEmpresas, true));
			for (int i = 0; i < empresasArraylist.size() && !salida; i++) {
				if(CIF.equalsIgnoreCase(empresasArraylist.get(i).CIF)) {
					System.out.println("Que desea modificar de la empresa:" +
							"\n1.- Nombre de la empresa" +
							"\n2.- Telefono de la empresa" +
							"\n3.- Dirección de la empresa");
					int opcion = lector.nextInt();
					switch (opcion) {
						case 1:
							System.out.println("Ha seleccionado cambiar el nombre de la empresa." +
									"\nIntroduce el nuevo nombre.");
							String nuevonombre=lector.nextLine();
							empresasArraylist.get(i).setNombreEmpresa(nuevonombre);
							break;
						case 2:
							System.out.println("Ha seleccionado cambiar el telefono de la empresa." +
									"\nIntroduce el nuevo numero de contacto de la empresa.");
							int telefono = lector.nextInt();
							empresasArraylist.get(i).setTelefono(telefono);
							break;
						case 3:
							System.out.println("Ha seleccionado cambiar la direccion. Debe de introducir la nueva direccion completa." +
									"\n Introduce calle, numero, piso y localidad.");
							String calle=lector.nextLine();
							int numero= lector.nextInt();
							String piso=lector.nextLine();
							String localidad = lector.nextLine();
							Direccion dir = new Direccion(calle, numero, piso, localidad);
							empresasArraylist.get(i).setDireccion(dir);
							break;
						default:
							System.out.println("No ha seleccionado una opcion valida.");
					}
					salida=true;
				} else {
					System.out.println("No hay empresa con ese CIF.");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
