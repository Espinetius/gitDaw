public class Juego {
	protected int dificultad;
	protected int vidas;

	/**
	 * de momento el constructor del juego solo va a setear las vidas en funcion de la dificultad.
	 * @param dificultad
	 */
	public Juego(int dificultad) {
		this.dificultad=dificultad;
		switch (dificultad) {
			case 1:
				vidas = 10;
				break;
			case 2:
				vidas = 8;
				break;
			case 3:
				vidas = 6;
				break;
		}
	}
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	public int getVidas() {
		return vidas;
	}

	/**
	 * este metodo es para ocultar la palabra para el usuario.
	 * @param palabra
	 */


}
