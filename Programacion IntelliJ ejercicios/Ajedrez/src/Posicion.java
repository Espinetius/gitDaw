public class Posicion {
	protected int fila;
	protected int columna;

	public Posicion(){
		this(0,0);
	}
	public Posicion(int fila, int columna) {
		this.fila=fila;
		this.columna=columna;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}

	@Override
	public String toString() {
		return "Posicion{" +
				"fila=" + fila +
				", columna=" + columna +
				'}';
	}
}
