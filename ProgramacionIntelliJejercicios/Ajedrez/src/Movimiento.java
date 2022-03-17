public class Movimiento {
	/**
	 * determina los atributos de la clase
	 */
	protected Posicion posInicial;
	protected Posicion posFinal;

	/**
	 * constructor base del movimiento
	 */
	public Movimiento() {
		this(new Posicion(), new Posicion());
	}

	/**
	 * constructor del movimiento con posiciones inicial y final
	 * @param posInicial
	 * @param posFinal
	 */
	public Movimiento(Posicion posInicial, Posicion posFinal) {
		this.posInicial = posInicial;
		this.posFinal = posFinal;
	}

	/**
	 * validacion del movimiento vertical
	 * @return
	 */
	public boolean esVertical() {
		boolean vertical=false;
		if (posInicial.columna==posFinal.columna) {
			vertical = true;
		}
		return vertical;
	}

	/**
	 * validacion del movimiento horizontal
	 * @return
	 */
	public boolean esHorizontal(){
		boolean horizontal=false ;
		if (posInicial.fila==posFinal.fila) {
			horizontal=true;
		}
		return horizontal;
	}

	/**
	 * validacion del movimiento diagonal
	 * @return
	 */
	public boolean esDiagonal() {
		boolean diagonal = false;
		if (Math.abs(saltoHorizontal())==Math.abs(saltoVertical())) {
			diagonal=true;
		}
		return diagonal;
	}

	/**
	 * metodo para averiguar el salto horizontal que da la pieza
	 * @return
	 */
	public int saltoHorizontal() {
		int saltoHorizontal;
		saltoHorizontal= posFinal.columna - posInicial.columna;
		return  saltoHorizontal;
	}

	/**
	 * metodo para averiguar el salto vertical que da la pieza
	 * @return
	 */
	public int saltoVertical() {
		int saltoVertical;
		saltoVertical= posFinal.fila - posInicial.fila;
		return saltoVertical;
	}

	/**
	 * metodo para pisar la impresion de la direccion de ram por las posiciones
	 * @return
	 */
	@Override
	public String toString() {
		return "Movimiento{" +
				"posInicial=" + posInicial +
				", posFinal=" + posFinal +
				'}';
	}
}
