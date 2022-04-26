public class Juego {
	protected String palabra;
	protected String[] palabraOculta;
	protected boolean end;
	protected int vidas;
	/**
	 * metodo Juego sin tener en cuenta la dificultad de las palabras.
	 * @param diccionario
	 */
	public Juego(Diccionario  diccionario) {
		vidas = 7;
		end = false;
		palabra=diccionario.damePalabraAleatoria();
		palabraOculta=new String[palabra.length()];
		for (int i = 0; i < palabraOculta.length; i++) {
			palabraOculta[i]="_";
		}
	}
	/**
	 * Metodo juego dependiendo de la dificultad
	 * @param diccionario
	 * @param dificultad
	 */
	public Juego(Diccionario  diccionario, int dificultad) {
		vidas = 7;
		end = false;
		palabra=diccionario.damePalabraAleatoria(dificultad);
		palabraOculta=new String[palabra.length()];
		for (int i = 0; i < palabraOculta.length; i++) {
			palabraOculta[i]="_";
		}
	}
	/**
	 * metodo para Imprimir los guiones de la palabra oculta
	 */
	public void mosstrarGuiones() {
		for (int i = 0; i < palabraOculta.length; i++) {
			System.out.print(palabraOculta[i]+" ");
		}
		System.out.println(" ");
	}

	/**
	 * Metodo para calcular las vidas restantes del jugador
	 * @param entrada
	 */
	public void vidasRestantes (String entrada) {
		if (!this.comprobarResultado(entrada)) {
			vidas=vidas-1;
		}
		if (vidas==0) {
			this.perder();
		}
	}

	/**
	 * Metodo para ver si has ganado el juego
	 * @return
	 */
	public boolean win() {
		boolean result = false;
		int contador=0;
		for (int i = 0; i < palabraOculta.length; i++) {
			if (!palabraOculta[i].equals("_")){
				contador++;
				if (contador==palabraOculta.length) {
					result=true;
					end=true;
				}
			}
		}
		return result;
	}

	/**
	 * Metodo para ver si has perdido el juego
	 * @return
	 */
	public boolean perder() {
		boolean result=false;
		if (vidas==0) {
			result=true;
			end=true;
		}
		return result;
	}

	/**
	 * metodo para comprobar si la letra o palabra introducida es correcta
	 * @param entrada
	 * @return
	 */
	public boolean comprobarResultado(String entrada) {
		boolean chek=false;
		if (entrada.length()==palabra.length()) {
			if (entrada.equalsIgnoreCase(palabra)){
				chek=true;
				this.win();
			}
		} else {
			if(entrada.length()==1) {
				for (int i = 0; i < palabra.length(); i++) {
					if (entrada.toCharArray()[0]==palabra.toCharArray()[i]) {
						chek=true;
						palabraOculta[i]=entrada;
					}
				}
			}
		}
		return chek;
	}

	/**
	 * Metodo que muestra mensaje de final del juego, te muestra la palabra si has perdido
	 */
	public void finalJuego() {
		if (this.perder()) {
			System.out.println("Has perdido el juego");
			System.out.println("La palabra era: "+ getPalabra());

		} else {
			if (this.win()) {
				System.out.println("Has ganado el juego");
			}
		}
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public boolean isEnd() {
		return end;
	}
	public void setEnd(boolean end) {
		this.end = end;
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	/**
	 * Metodo para Imprimir el muñeco por pantalla (este metodo ha sido compartido por varias personas de clase)
	 * @param i
	 */
	public void pintarMuñeco(int i){
		switch (i) {
			case 6:
				System.out.println(" ---------------------");
				for (int j = 0; j < 15; j++) {
					System.out.println(" |");
				}
				System.out.println("____");
				break;
			case 5:
				System.out.println(" ---------------------");
				System.out.println(" |                     |");
				System.out.println(" |                     |");
				System.out.println(" |                  -------");
				System.out.println(" |                 | -  -  |");
				System.out.println(" |                 |   o   |");
				System.out.println(" |                  -------");
				for (int j = 0; j < 10; j++) {
					System.out.println(" |");
				}
				System.out.println("____");
				break;

			case 4:
				System.out.println(" ---------------------");
				System.out.println(" |                     |");
				System.out.println(" |                     |");
				System.out.println(" |                  -------");
				System.out.println(" |                 | -  -  |");
				System.out.println(" |                 |   o   |");
				System.out.println(" |                  -------");
				System.out.println(" |                     |   ");
				System.out.println(" |                     |   ");
				System.out.println(" |                     |   ");
				System.out.println(" |                     |   ");
				System.out.println(" |                     |   ");
				for (int j = 0; j < 5; j++) {
					System.out.println(" |");

				}
				System.out.println("____");
				break;

			case 3:
				System.out.println(" ---------------------");
				System.out.println(" |                     |");
				System.out.println(" |                     |");
				System.out.println(" |                  -------");
				System.out.println(" |                 | -  -  |");
				System.out.println(" |                 |   o   |");
				System.out.println(" |                  -------");
				System.out.println(" |                     |   ");
				System.out.println(" |                   / |   ");
				System.out.println(" |                 /   |   ");
				System.out.println(" |                /    |   ");
				System.out.println(" |                     |   ");
				for (int j = 0; j < 5; j++) {
					System.out.println(" |");

				}
				System.out.println("____");
				break;

			case 2:
				System.out.println(" ---------------------");
				System.out.println(" |                     |");
				System.out.println(" |                     |");
				System.out.println(" |                  -------");
				System.out.println(" |                 | -  -  |");
				System.out.println(" |                 |   o   |");
				System.out.println(" |                  -------");
				System.out.println(" |                     |   ");
				System.out.println(" |                   / | \\ ");
				System.out.println(" |                  /  |   \\ ");
				System.out.println(" |                 /   |     \\ ");
				System.out.println(" |                     |   ");
				for (int j = 0; j < 5; j++) {
					System.out.println(" |");

				}
				System.out.println("____");
				break;

			case 1:
				System.out.println(" ---------------------");
				System.out.println(" |                     |");
				System.out.println(" |                     |");
				System.out.println(" |                  -------");
				System.out.println(" |                 | -  -  |");
				System.out.println(" |                 |   o   |");
				System.out.println(" |                  -------");
				System.out.println(" |                     |   ");
				System.out.println(" |                   / | \\ ");
				System.out.println(" |                  /  |   \\ ");
				System.out.println(" |                 /   |     \\ ");
				System.out.println(" |                     |   ");
				System.out.println(" |                    /  ");
				System.out.println(" |                   /      ");
				System.out.println(" |                  /       ");
				for (int j = 0; j < 2; j++) {
					System.out.println(" |");
				}
				System.out.println("____");
				break;

			case 0:
				System.out.println(" ---------------------");
				System.out.println(" |                     |");
				System.out.println(" |                     |");
				System.out.println(" |                  -------");
				System.out.println(" |                 | X  X  |");
				System.out.println(" |                 |   o   |");
				System.out.println(" |                  -------");
				System.out.println(" |                     |   ");
				System.out.println(" |                   / | \\ ");
				System.out.println(" |                  /  |   \\ ");
				System.out.println(" |                 /   |     \\ ");
				System.out.println(" |                     |   ");
				System.out.println(" |                    / \\");
				System.out.println(" |                   /   \\  ");
				System.out.println(" |                  /     \\ ");
				for (int j = 0; j < 2; j++) {
					System.out.println(" |");

				}
				System.out.println("____");
				System.out.println("Perdiste");
				break;
		}
	}
}
