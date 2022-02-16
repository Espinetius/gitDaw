public class Reina extends Pieza{
	public Reina(String color) { super(color);}

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
		return nombre="Reina";
	}
	@Override
	public String toString() {
		String pieza;
		if (color.equalsIgnoreCase("blanco")){
			pieza="\u2655 ";
		} else {
			pieza="\u265B ";
		}
		return pieza;
	}
}
