public class Posicion {
	/**
	 * atributos que tiene la clase  posicion para acceder a un cuadrante del tablero
	 */
	protected int fila;
	protected int columna;

	/**
	 * constructor base de la posicion, coloca lo que sea en 0,0
	 */
	public Posicion(){
		this(0,0);
	}

	/**
	 * constructor de la posicion en base de la fila y la columna
	 * @param fila
	 * @param columna
	 */
	public Posicion(int fila, int columna) {
		this.fila=fila;
		this.columna=columna;
	}

	/**
	 * metodo para recuperar el valor de la fila
	 * @return
	 */
	public int getFila() {
		return fila;
	}

	/**
	 * metodo para asignar un valor a la fila
	 * @param fila
	 */
	public void setFila(int fila) {
		this.fila = fila;
	}

	/**
	 * metodo para recuperar el valor de la columna
	 * @return
	 */
	public int getColumna() {
		return columna;
	}

	/**
	 * metodo para asignar un valor a la columna
	 * @param columna
	 */
	public void setColumna(int columna) {
		this.columna = columna;
	}
	/**
	 * metodo para decir la posicion sustituyendo a decir la direccion de
	 * ram.
	 * @return
	 */
	@Override
	public String toString() {
		return "Posicion{" +
				"fila=" + fila +
				", columna=" + columna +
				'}';
	}
}
