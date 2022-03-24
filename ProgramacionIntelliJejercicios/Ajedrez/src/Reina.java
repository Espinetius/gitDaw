public class Reina extends Pieza{
	/**
	 * te devuelve el color del padre
	 * @param color
	 */
	public Reina(String color) { super(color);}

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
		return nombre="Reina";
	}

	/**
	 * te pinta la pieza dependiendo del padre, si es blanco o negro
	 *
	 * @return
	 */
	@Override
	public String toString() {
		String pieza;
		if (color.equalsIgnoreCase("negro")){
			//pieza="\u2655 ";
			pieza="Rb";
		} else {
			//pieza="\u265B ";
			pieza="Rn";
		}
		return pieza;
	}
}
