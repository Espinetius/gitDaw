public class Alfil extends Pieza{
	/**
	 *
	 * @param color
	 * pilla el color de la pieza padre
	 */
	public Alfil(String color) {super(color); }

	/**
	 *
	 * @param mov
	 * @return
	 * valida que el movimiento del alfil es en diagonal
	 */
	@Override
	public boolean validoMovimiento(Movimiento mov) {
		boolean respuesta=false;
		if(mov.esDiagonal()) {
			respuesta=true;
		}
		return respuesta;
	}

	/**
	 *
	 * nos devuelve el nombre del alfil
	 * @return
	 */
	@Override
	public String pintarPieza() {
		return nombre ="Alfil";
	}
	@Override
	/**
	 * pinta la pieza dependiendo del color, si es blanco o negra.
	 */
	public String toString() {
		String pieza;
		if (color.equalsIgnoreCase("negro")){
			//pieza= "\u2657 ";
			pieza = "Ab";
		} else {
			//pieza="\u265D ";
			pieza="An";
		}
		return pieza;
	}
}
