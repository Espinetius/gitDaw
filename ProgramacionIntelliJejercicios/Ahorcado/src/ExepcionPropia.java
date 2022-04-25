public class ExepcionPropia extends Exception{
	public ExepcionPropia() {
		super("No hay esa dificultad");
	}
	public ExepcionPropia(int i) {
		super("La dificultad "+ i + " no existe");
	}
	public ExepcionPropia(String i) {
		super("La dificultad tiene que ser un número");
	}
}
