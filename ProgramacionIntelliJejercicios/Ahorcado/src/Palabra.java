public class Palabra {
	protected String palabra;
	public Palabra(){
		this("test");
	}
	public Palabra (String palabra) {
		this.palabra=palabra;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public String toString() {
		return "Palabra: " + palabra;
	}
}
