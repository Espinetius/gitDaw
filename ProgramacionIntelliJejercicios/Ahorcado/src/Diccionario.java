import groovy.io.GroovyPrintWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Diccionario {
	protected ArrayList<Linea> dic;
	public Diccionario() {
		dic = new ArrayList<>();
		dic.add(new Linea("ascua",1));
		dic.add(new Linea("ambos",1));
		dic.add(new Linea("bruta",1));
		dic.add(new Linea("ciega",1));
		dic.add(new Linea("forma",1));
		dic.add(new Linea("dagas",1));
		dic.add(new Linea("locos",1));
		dic.add(new Linea("marca",1));
		dic.add(new Linea("sombra",2));
		dic.add(new Linea("sentir",2));
		dic.add(new Linea("mezcla",2));
		dic.add(new Linea("peinar",2));
		dic.add(new Linea("servir",2));
		dic.add(new Linea("fisico",2));
		dic.add(new Linea("lastre",2));
		dic.add(new Linea("baches",2));
		dic.add(new Linea("balanza",3));
		dic.add(new Linea("adentro",3));
		dic.add(new Linea("biombos",3));
		dic.add(new Linea("central",3));
		dic.add(new Linea("desfila",3));
		dic.add(new Linea("parejas",3));
		dic.add(new Linea("deporte",3));
		dic.add(new Linea("pisadas",3));
	}

	/**
	 * metodo para comprobar que el fichero existe y si no existe lo crea.
	 */
	public void comprobarFichero() {
		File diccionario = new File("Diccionario.txt");
		if (!diccionario.exists()) {
			try {
				diccionario.createNewFile();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * metodo para imprimir el fichero del diccionario, como esta con el printwriter se resetea cada vez que se llama
	 */
	public void imprimirFicheroNuevo() {
		File diccionario = new File("Diccionario.txt");
		if (!diccionario.exists()) {
			try {
				diccionario.createNewFile();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			PrintWriter pw = new PrintWriter(diccionario);
			System.out.println("EL formato del diccionario es: Palabra ; dificultad");
			for (int i = 0; i < dic.size(); i++) {
				pw.println(dic.get(i));
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void imprimirFichero() {
		File diccionario = new File("Diccionario.txt");
		if (!diccionario.exists()) {
			try {
				diccionario.createNewFile();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Scanner lector = null;
		try {
			lector = new Scanner(diccionario);
			for (int i = 0; i < dic.size(); i++) {
				System.out.println(dic.get(i));
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	public void añadirLineas(Linea linea) {
		File diccionario = new File("Diccionario.txt");
		if (!diccionario.exists()) {
			try {
				diccionario.createNewFile();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(diccionario, true));
			pw.println(linea);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void modificarDiccionario() {
		comprobarFichero();

	}
}
