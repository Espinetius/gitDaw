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
				if (!empresa.CIF.equalsIgnoreCase(empresasArraylist.get(i).CIF)||i==empresasArraylist.size()-1){
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
	public void actualizarEmpresa(Empresa empresa) {
		boolean salida=false;
		try {
			comprobarFichero();
			PrintWriter pw = new PrintWriter(new FileWriter(ficheroListaEmpresas, true));
			for (int i = 0; i < empresasArraylist.size() && !salida; i++) {
				if(empresa.CIF.equalsIgnoreCase(empresasArraylist.get(i).CIF)) {
					empresasArraylist.add(empresa);
					salida=true;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
