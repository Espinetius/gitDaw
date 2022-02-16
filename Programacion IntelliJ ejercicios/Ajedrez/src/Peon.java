public class Peon extends Pieza{
	public Peon(String color) {
		super(color);
	}

	@Override
	public boolean validoMovimiento(Movimiento mov) {
		boolean respuesta=false;
		if (mov.esVertical()) {
			respuesta=true;
		}
		return respuesta;
	}

	@Override
	public String pintarPieza() {
		return nombre="Peon";
	}

	@Override
	public String toString() {
		String pieza;
		if (color.equalsIgnoreCase("blanco")){
			pieza="\u2659 ";
		} else {
			pieza="\u265F ";
		}
		return pieza;
	}
}
