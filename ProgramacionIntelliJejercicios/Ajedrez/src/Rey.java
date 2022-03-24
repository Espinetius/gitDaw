public class Rey extends Pieza{
	/**
	 * te devuelve el color segun el padre
	 * @param color
	 */
	public Rey(String color) { super(color);}

	/**
	 * te valida el movimiento de la pieza
	 * @param mov
	 * @return
	 */
	@Override
	public boolean validoMovimiento(Movimiento mov) {
		boolean respuesta=false;
		if(mov.esDiagonal()||mov.esVertical()||mov.esHorizontal()) {
			respuesta=true;
		}
		return respuesta;
	}

	/**
	 * te devuelve el nombre de la pieza
	 * @return
	 */
	@Override
	public String pintarPieza() {
		return nombre="Rey";
	}
	@Override
	/**
	 * te imprime la pieza segun el color asignado, blanco o negro.
	 */
	public String toString() {
		String pieza;
		if (color.equalsIgnoreCase("negro")){
			//pieza="\u2654 ";
			pieza="RB";
		} else {
			//pieza="\u265A ";
			pieza="RN";
		}
		return pieza;
	}
}
