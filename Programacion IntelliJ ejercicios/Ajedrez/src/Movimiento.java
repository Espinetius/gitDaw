public class Movimiento {
	protected Posicion posInicial;
	protected Posicion posFinal;
	public Movimiento() {
		this(new Posicion(), new Posicion());
	}
	public Movimiento(Posicion posInicial, Posicion posFinal) {
		this.posInicial = posInicial;
		this.posFinal = posFinal;
	}
	public boolean esVertical() {
		boolean vertical=false;
		if (posInicial.columna==posFinal.columna) {
			vertical = true;
		}
		return vertical;
	}
	public boolean esHorizontal(){
		boolean horizontal=false ;
		if (posInicial.fila==posFinal.fila) {
			horizontal=true;
		}
		return horizontal;
	}
	public boolean esDiagonal() {
		boolean diagonal = false;
		if (Math.abs(saltoHorizontal())==Math.abs(saltoVertical())) {
			diagonal=true;
		}
		return diagonal;
	}
	public int saltoHorizontal() {
		int saltoHorizontal;
		saltoHorizontal= posFinal.columna - posInicial.columna;
		return  saltoHorizontal;
	}
	public int saltoVertical() {
		int saltoVertical;
		saltoVertical= posFinal.fila - posInicial.fila;
		return saltoVertical;
	}


	@Override
	public String toString() {
		return "Movimiento{" +
				"posInicial=" + posInicial +
				", posFinal=" + posFinal +
				'}';
	}
}
