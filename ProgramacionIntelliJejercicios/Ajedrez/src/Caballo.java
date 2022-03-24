public class Caballo extends Pieza{
	/**
	 * te devuelve el color del padre
	 * @param color
	 */
	public Caballo(String color) {
		super(color);
	}

	/**
	 * te valida el movimiento en forma de L del caballo en todas las direcciones.
	 * @param mov
	 * @return
	 */
	@Override
	public boolean validoMovimiento(Movimiento mov) {
		boolean respuesta = false;
		if((Math.abs(mov.saltoHorizontal()*2)+Math.abs(mov.saltoVertical()))==3||(Math.abs(mov.saltoVertical()*2)+Math.abs(mov.saltoHorizontal()))==3){
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
		return nombre="Caballo";
	}

	/**
	 * te pinta la pieza dependiendo del color del padre, si es blanco o negro
	 * @return
	 */
	@Override
	public String toString() {
		String pieza;
		if (color.equalsIgnoreCase("negro")){
			//pieza="\u2658 ";
			pieza="Cb";
		} else {
			//pieza="\u265E ";
			pieza="Cn";
		}
		return pieza;
	}
}
