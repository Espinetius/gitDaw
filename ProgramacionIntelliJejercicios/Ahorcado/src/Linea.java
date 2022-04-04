public class Linea {
	protected String palabra;
	protected int dificultad;
	private int indice=1;
	public Linea() {}
	public Linea(String palabra, int dificultad) {
		this.palabra=palabra;
		this.dificultad=dificultad;
		indice++;
	}
	public Linea(String palabra) {
		this.palabra=palabra;
		dificultad=palabra.length()-4;
	}
	@Override
	public String toString() {
		return palabra + " ; " + dificultad ;
	}
}
