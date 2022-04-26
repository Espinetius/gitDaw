import groovy.io.GroovyPrintWriter;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Diccionario {
	protected ArrayList<Linea> dic;
	protected static final String nombreFichero="Diccionario.txt";
	public Diccionario() {
		dic = new ArrayList<>();
		dic.add(new Linea("ascua",1));
		dic.add(new Linea("ambos",1));
		dic.add(new Linea("bruta",1));
		dic.add(new Linea("ciega",1));
		dic.add(new Linea("forma",1));
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
		comprobarFichero();
	}
	/**
	 * metodo para comprobar que el fichero existe y si no existe lo crea.
	 */
	public static void comprobarFichero() {
		File diccionario = new File("Diccionario.txt");
		if (!diccionario.exists()) {
			try {
				diccionario.createNewFile();
				imprimirFichero();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * metodo para imprimir el fichero del diccionario, como esta con el printwriter se resetea cada vez que se llama
	 */
	public  void imprimirFicheroNuevo() {
		try {
			comprobarFichero();
			PrintWriter pw = new PrintWriter(new File("Diccionario.txt"));
			System.out.println("EL formato del diccionario es: Palabra ; dificultad");
			for (int i = 0; i < dic.size(); i++) {
				pw.println(dic.get(i));
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * metodo para imprimir el fichero del diccionario
	 */
	public static void imprimirFichero() {
		Scanner lector = null;
		try {
			comprobarFichero();
			lector = new Scanner(new File("Diccionario.txt"));
			while(lector.hasNextLine()){
				System.out.println(lector.nextLine());
			}
			lector.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
	/**
	 * metodo para añadir lineas en el diccionario (fichero)
	 * @param linea
	 */
	public void añadirLineas(Linea linea) {
		try {
			comprobarFichero();
			PrintWriter pw = new PrintWriter(new FileWriter("Diccionario.txt", true));
			pw.println(linea);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo para añardir al arraylist las palabras que no estaban pero si en el fichero, y sacar una
	 * palabra sacando una linea aleatoria primero.
	 * @return
	 */
	public String damePalabraAleatoria() {
		String palabra = null;
		Scanner lector;
		while (palabra==null) {
			comprobarFichero();
			lector = new Scanner(Diccionario.nombreFichero);
			while (lector.hasNextLine()) {
				dic.add(new Linea(lector.nextLine().split(" ; ")[0]));
			}
			palabra = String.valueOf(dic.get((int)(Math.random()*dic.size()))).split(" ; ")[0];
			lector.close();
		}
		return palabra;
	}

	/**
	 * Metodo que te da una palabra aleatoria del fichero en funcion de la dificultad pedida.
	 * @param dificultad
	 * @return
	 */
	public String damePalabraAleatoria(int dificultad) {
		String palabra = null;
		Scanner lector;
		int diff;
		while (palabra==null) {
			try {
				comprobarFichero();
				lector = new Scanner(new File("Diccionario.txt"));
				while (lector.hasNextLine()) {
					dic.add(new Linea(lector.nextLine().split(" ; ")[0]));
				}
				ArrayList<Linea> aux = new ArrayList<>();

				for (int i = 0; i<dic.size(); i++) {
					if (dic.get(i).getDificultad() == dificultad) {
						aux.add(dic.get(i));
					}
				}
				palabra=String.valueOf(aux.get((int)(Math.random()*dic.size()+1))).split(" ; ")[0];
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IndexOutOfBoundsException ex) {
				ex.getMessage();
			}
		}
		return palabra;
	}
	/**
	 * Metodo para eliminar filas o lineas de palabras del arraylist.
	 * Este metodo no utiliza el fichero del diccionario
	 * @param linea
	 */
	public void borrarLineas(Linea linea) {
		comprobarFichero();
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce la palabra a eliminar");
		linea= new Linea(lector.nextLine());
		for (int i = 0; i < dic.size(); i++) {
			if (dic.get(i).palabra.equalsIgnoreCase(linea.palabra)) {
				dic.remove(i);
			}
		}
	}

}
