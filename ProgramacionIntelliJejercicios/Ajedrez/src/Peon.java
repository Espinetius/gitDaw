public class Peon extends Pieza{
	/**
	 * te devuelve el color del padre
	 * @param color
	 */
	public Peon(String color) {
		super(color);
	}

	/**
	 * te valida el movimiento de forma vertical del peon
	 * @param mov
	 * @return
	 */
	@Override
	public boolean validoMovimiento(Movimiento mov) {
		boolean respuesta=false;
		if (mov.esVertical()) {
			respuesta=true;
		}
		return respuesta;
	}

	/**
	 * te indica si el peon puede o no comer piezas en diagonal
	 * @param tablero
	 * @param pos
	 * @return
	 */
	public boolean validoComer(Tablero tablero, Posicion pos) {
		boolean respuesta = false;

		return respuesta;
	}

	/**
	 * te devuelve el nombre de la pieza
	 * @return
	 */
	@Override
	public String pintarPieza() {
		return nombre="Peon";
	}

	/**
	 * te pinta la pieza en el tablero dependiendo del color si es blanco o negro
	 * @return
	 */
	@Override
	public String toString() {
		String pieza;
		if (color.equalsIgnoreCase("negro")){
			//pieza="\u2659 ";
			pieza="Pb";
		} else {
			//pieza="\u265F ";
			pieza="Pn";
		}
		return pieza;
	}
}
