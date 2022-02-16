public class Rey extends Pieza{
	public Rey(String color) { super(color);}

	@Override
	public boolean validoMovimiento(Movimiento mov) {
		boolean respuesta=false;
		if(mov.esDiagonal()||mov.esVertical()||mov.esHorizontal()) {
			respuesta=true;
		}
		return respuesta;
	}

	@Override
	public String pintarPieza() {
		return nombre="Rey";
	}
	@Override
	public String toString() {
		String pieza;
		if (color.equalsIgnoreCase("blanco")){
			pieza="\u2654 ";
		} else {
			pieza="\u265A ";
		}
		return pieza;
	}
}
