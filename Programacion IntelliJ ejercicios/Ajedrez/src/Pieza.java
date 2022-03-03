public abstract class Pieza {
	protected String color;
	protected String nombre;

	public String getColor() {
		return color;

	}

	public Pieza(String color) {
		if (color.equalsIgnoreCase("blanco")) {
			this.color = "blanco";
		} else if (color.equalsIgnoreCase("negro")) {
			this.color= "negro";
		}
	}
	public abstract boolean validoMovimiento(Movimiento mov);
	public abstract String pintarPieza();

	@Override
	public abstract String toString();
}
