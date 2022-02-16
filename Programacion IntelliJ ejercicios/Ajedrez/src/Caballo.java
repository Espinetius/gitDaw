public class Caballo extends Pieza{
	public Caballo(String color) {
		super(color);
	}

	@Override
	public boolean validoMovimiento(Movimiento mov) {
		boolean respuesta = false;
		if((Math.abs(mov.saltoHorizontal()*2)+Math.abs(mov.saltoVertical()))==3||(Math.abs(mov.saltoVertical()*2)+Math.abs(mov.saltoHorizontal()))==3){
			respuesta=true;
		}
		return respuesta;
	}

	@Override
	public String pintarPieza() {
		return nombre="Caballo";
	}

	@Override
	public String toString() {
		String pieza;
		if (color.equalsIgnoreCase("blanco")){
			pieza="\u2658 ";
		} else {
			pieza="\u265E ";
		}
		return pieza;
	}
}
