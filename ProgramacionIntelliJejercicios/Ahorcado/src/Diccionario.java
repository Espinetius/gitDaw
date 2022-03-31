import java.util.ArrayList;
import java.util.Scanner;
public class Diccionario {
	protected String palabra;
	protected ArrayList<String> facil;
	protected ArrayList<String> medio;
	protected ArrayList<String> dificil;
	protected ArrayList<String> personalizado;
	protected char[] palabraOculta;
	public Diccionario () {this((int)(Math.random()*3+1));}
	/**
	 * constructor para seleccionar una palabra segun el nivel de dificultad del juego
	 * @param dificultad
	 */
	public Diccionario (int dificultad) {
		facil = new ArrayList<>();
		facil.add("ascua");
		facil.add("ambos");
		facil.add("bruta");
		facil.add("ciega");
		facil.add("forma");
		facil.add("dagas");
		facil.add("locos");
		facil.add("marca");
		medio = new ArrayList<>();
		medio.add("sombra");
		medio.add("sentir");
		medio.add("mezcla");
		medio.add("peinar");
		medio.add("servir");
		medio.add("fisico");
		medio.add("lastre");
		medio.add("baches");
		dificil = new ArrayList<>();
		dificil.add("balanza");
		dificil.add("adentro");
		dificil.add("biombos");
		dificil.add("central");
		dificil.add("desfila");
		dificil.add("parejas");
		dificil.add("deporte");
		dificil.add("pisadas");
		personalizado=new ArrayList<>();
		switch (dificultad) {
			case 1:
				palabra = facil.get((int) (Math.random() * (facil.size())));
				break;
			case 2:
				palabra = medio.get((int) (Math.random() * (medio.size())));
				break;
			case 3:
				palabra = dificil.get((int) (Math.random() * (dificil.size())));
				break;
			default:
				palabra = personalizado.get((int) (Math.random() * (personalizado.size())));
		}
		palabraOculta=palabra.toCharArray();
	}
	/**
	 * este metodo servira para listar las palabras ordenadas en grupos por dificultad   facil || medio || dificil
	 */
	public void listar () {
			System.out.println("Estas son las palabras Faciles 5 letras");
			for (int i = 0; i < facil.size(); i++) {
				System.out.println(facil.get(i));
			}
			System.out.println("Estas son las palabras Medias 6 letras");
			for (int i = 0; i < medio.size(); i++) {
				System.out.println(medio.get(i));
			}
			System.out.println("Estas son las palabras Dificiles 7 letras");
			for (int i = 0; i < dificil.size(); i++) {
				System.out.println(dificil.get(i));
			}
			if (personalizado!=null) {
				System.out.println("Aqui se encuentra sus palabras introducidas");
				for (int i = 0; i < personalizado.size(); i++) {
					System.out.println(personalizado.get(i));
				}
			}
	}
	/**
	 * este medoto servira para modificar el diccionario añadir y modificar
	 */
	public void actualizarPalabras() {
		Scanner lector = new Scanner(System.in);
		int opcion;
		String palabra;
		boolean salida = false;
		do {
			System.out.println("Seleccione una de las dos opciones:" +
					"\n1. Añadir palabra nueva" +
					"\n2. Cambiar una palabra exisistente" +
					"\n3. Eliminar una palabra de la dificultad personalizada" +
					"\n4. Menu anterior");
			opcion = lector.nextInt();
			lector.nextLine();
			switch (opcion) {
				case 1:
					System.out.println("Introduce la palabra a introducir");
					palabra = lector.nextLine();
					addpalabras(palabra);
					break;
				case 2:
					System.out.println("A continuacion se listaran las palabras para que seleccione la que quiere modificar");
					listar();
					System.out.println("Seleccione la dificultad de la palabra a modificar, e introduzca la palabra nueva con su indice");
					int dificultad = lector.nextInt();
					palabra = lector.nextLine();
					int indice = lector.nextInt();
					cambiarPalabras(palabra, dificultad, indice);
					break;
				case 3:
					System.out.println("A continuacion se listan las palabras. Luego escriba la palabra que desea eliminar " +
							"\n(DEBE SER UNA PALABRA DEL DICCIONARIO PERSONALIZADO)");
					listar();
					palabra = lector.nextLine();
					deletepalabra(palabra);
					break;
				case 4:
					System.out.println("Volviendo al menu anteior");
					salida = true;
					break;
			}
		} while (salida);
	}
	/**
	 * metodo para añadir palabras nuevas al diccionario de personalizado
	 * @param palabra
	 */
	public void addpalabras(String palabra) {
		personalizado.add(palabra);
	}
	public void deletepalabra (String palabra) {
		personalizado.remove(palabra);
	}
	/**
	 * metodo para cambiar una palabra del diccionario dependiendo de la dificultad y teniendo en cuenta el indice
	 * @param palabra
	 * @param dificultad
	 * @param indice
	 */
	public void cambiarPalabras(String palabra, int dificultad, int indice) {
		switch (dificultad) {
			case 1:
				facil.set(indice ,palabra);
				break;
			case 2:
				medio.set(indice, palabra);
				break;
			case 3:
				dificil.set(indice, palabra);
				break;
		}
	}
	/**
	 * metodo para recuperar la palabra creada para el juego
	 * @return
	 */
	public String getPalabra() {
		return palabra;
	}
	public String getPalabraoculta () {
		//palabraOculta=setPalabraOculta(palabra);
		return palabraOculta.toString();
	}
	public void setPalabraOculta(String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			palabraOculta[i]='_';
		}
	}
	public void comprobacionLetra(char letra) {
		for (int i = 0; i < palabra.length(); i++) {
			if (letra == palabra.charAt(i)) {
				palabraOculta[i] = letra;
			}

		}

	}
}
