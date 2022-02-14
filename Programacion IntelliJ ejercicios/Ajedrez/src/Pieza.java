public abstract class Pieza {
	protected String color;
	protected String nombre;

	public String getColor() {
		return color;
	}

	public Pieza(String color) {
		if (color.equalsIgnoreCase("blanco")) {
			color = "blanco";
		} else if (color.equalsIgnoreCase("negro")) {
			color= "negro";
		}
	}
	public abstract boolean validoMovimiento(Movimiento mov);
	public abstract String pintarPieza();

	@Override
	public String toString() {
		return "Pieza -> " +color;
	}
}
