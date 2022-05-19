import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaUsuarios {
	protected ArrayList<User>usuarios;
	protected static final  String nombreListaUser="Lista_usuarios.txt";
	public ListaUsuarios() {
		usuarios= new ArrayList<>();
		usuarios.add(new User("David", "1234"));
		usuarios.add(new User());
	}
	public static void comprobarFichero() {
		File ficheroListaEmpresas = new File(nombreListaUser);
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
			PrintWriter pw = new PrintWriter(new File(nombreListaUser));
			System.out.println("Los usuarios son:");
			for (int i = 0; i < usuarios.size(); i++) {
				pw.println(usuarios.get(i).usuario);
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
			lector = new Scanner(new File(nombreListaUser));
			while(lector.hasNextLine()){
				System.out.println(lector.nextLine());
			}
			lector.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	public void añadirUser(User user) {
		boolean salida=false;
		try {
			comprobarFichero();
			PrintWriter pw = new PrintWriter(new FileWriter(nombreListaUser, true));
			for (int i = 0; i < usuarios.size() && !salida; i++) {
				if (!user.usuario.equalsIgnoreCase(usuarios.get(i).usuario)||i==usuarios.size()-1){
					salida=true;
				}
			}
			if (salida) {
				pw.println(user);
			} else {
				System.out.println("El usuario ya existe, cambia la contraseña si no la recuerdas.");
			}
			pw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public boolean login(String user) {
		boolean salida=false;
		boolean acceso=false;
		Scanner lector = new Scanner(System.in);
		try {
			comprobarFichero();
			for (int i=0; lector.hasNextLine(); i++) {
				if (user.equalsIgnoreCase(usuarios.get(i).usuario)) {
					salida=true;
				}
			}
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		if (salida) {
			boolean flag=false;
			System.out.println("Introduce la contraseña: ");
			String pass;
			for (int i = 0; i < 3 && !flag; i++) {
				System.out.println("Intento "+(i+1)+" de 3");
				pass = lector.nextLine();
				if (pass.equalsIgnoreCase(usuarios.get(i).pass)) {
					acceso=true;
					flag=true;
				}
			}
		}
		return acceso;
	}
}
