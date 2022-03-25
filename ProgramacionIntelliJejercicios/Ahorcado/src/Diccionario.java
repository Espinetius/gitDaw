public class Diccionario {
	protected String facil[] = {"ascua", "ambos", "bruta", "ciega", "forma", "dagas", "locos", "marca"};
	protected String medio[] = {"sombra", "sentir", "mezcla", "peinar", "servir", "fisico", "lastre", "baches"};
	protected String dificil[] = {"balanza", "adentro", "biombos", "central", "desfila", "parejas", "deporte", "pisadas"};
	protected String palabra;
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
				palabra = facil[(int)(Math.random()*(facil.length+1))];
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
	 * este metodo servira para listar las palabras ordenadas en columnas por dificultad   facil || medio || dificil
	 */
	public void listar () {
		System.out.println("A continuacion se imprimiran las palabras en columnas de dificultad (facil | medio | dificil)");
		for (int i=0; i< (facil.length+ medio.length+ dificil.length);i++) {
			System.out.print(facil[i]+ " " + medio[i] + " " + dificil[i]);
		}
	}

	@Override
	public String toString() {
		return palabra;
	}
}
