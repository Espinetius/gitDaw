import java.util.ArrayList;

public class Diccionario {
	// {"ascua", "ambos", "bruta", "ciega", "forma", "dagas", "locos", "marca"};
	protected String medio[] = {"sombra", "sentir", "mezcla", "peinar", "servir", "fisico", "lastre", "baches"};
	protected String dificil[] = {"balanza", "adentro", "biombos", "central", "desfila", "parejas", "deporte", "pisadas"};
	protected String palabra;
	protected ArrayList<String> facil;
	public Diccionario () {
		this(1);
	}

	/**
	 * constructor para seleccionar una palabra segun el nivel de dificultad del juego
	 * @param dificultad
	 */
	public Diccionario (int dificultad) {
		switch (dificultad) {
			case 1:
				facil=new ArrayList<String>();
				facil.add("ascua");
				facil.add("ambos");
				facil.add("bruta");
				facil.add("ciega");
				facil.add("forma");
				palabra = facil.get((int)(Math.random()*(facil.size()+1)));
				break;
			case 2:
				palabra = medio[(int)(Math.random()*(medio.length+1))];
				break;
			case 3:
				palabra = dificil[(int)(Math.random()*(dificil.length+1))];
				break;
		}

	}
	/**
	 * este metodo servira para listar las palabras ordenadas en grupos por dificultad   facil || medio || dificil
	 */
	public void listar () {
		System.out.println("A continuacion se imprimiran las palabras en grupos de dificultad (facil | medio | dificil)");
		for (int i=0; i< facil.size() ;i++) {
			System.out.print(facil.get(i));
		}
		for (int i = 0; i < medio.length; i++) {
			System.out.println(medio[i]);
		}
		for (int i = 0; i < dificil.length; i++) {
			System.out.println(dificil[i]);
		}
	}

	public String getPalabra() {
		return palabra;
	}
}
