public class Alfil extends Pieza{

	public Alfil(String color) {super(color); }

	@Override
	public boolean validoMovimiento(Movimiento mov) {
		boolean respuesta=false;
		if(mov.esDiagonal()) {
			respuesta=true;
		}
		return respuesta;
	}

	@Override
	public String pintarPieza() {
		return nombre ="Alfil";
	}
	@Override
	public String toString() {
		String pieza;
		if (color.equalsIgnoreCase("blanco")){
			pieza= "\u2657 ";
		} else {
			pieza="\u265D ";
		}
		return pieza;
	}
}
