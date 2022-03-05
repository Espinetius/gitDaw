public abstract class Pieza {
	/**
	 * asigna los atributos de color y nombre a la pieza
	 */
	protected String color;
	protected String nombre;

	/**
	 * metodo para recuperar el color de la pieza
	 * @return
	 */
	public String getColor() {
		return color;

	}

	/**
	 * asiga dos posibilidades para el color, blanco o negro.
	 * @param color
	 */
	public Pieza(String color) {
		if (color.equalsIgnoreCase("blanco")) {
			this.color = "blanco";
		} else if (color.equalsIgnoreCase("negro")) {
			this.color= "negro";
		}
	}

	/**
	 * metodo abstracto para validar el mov de la pieza
	 * @param mov
	 * @return
	 */
	public abstract boolean validoMovimiento(Movimiento mov);

	/**
	 * metodo abstracto para pintar el atributo nombre a la pieza
	 * @return
	 */
	public abstract String pintarPieza();

	/**
	 * metodo abstracto para pintar la pieza en el tablero.
	 * @return
	 */
	@Override
	public abstract String toString();
}
