import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaEmpresas {
	protected ArrayList<Empresa> empresasArraylist;
	protected static final String ficheroListaEmpresas = "Listado_Empresas.txt";
	public ListaEmpresas() {
		empresasArraylist = new ArrayList<>();
		empresasArraylist.add(new Empresa("...Empresa...","...NIF..."));
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
				if (!empresa.NIF.equalsIgnoreCase(empresasArraylist.get(i).NIF)||i==empresasArraylist.size()-1){
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
				if(empresa.NIF.equalsIgnoreCase(empresasArraylist.get(i).NIF)) {
					empresasArraylist.add(empresa);
					salida=true;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
