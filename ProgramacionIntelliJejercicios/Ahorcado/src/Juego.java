public class Juego {
	protected String palabra;
	protected String[] palabraOculta;
	protected boolean victoria;
	protected int vidas;
	public Juego(Diccionario  diccionario) {
		vidas = 10;
		victoria = false;
		palabra=diccionario.damePalabraAleatoria();
		palabraOculta=new String[palabra.length()];
		for (int i = 0; i < palabraOculta.length; i++) {
			palabraOculta[i]="_";
		}
	}
	public void mosstrarGuiones() {
		for (int i = 0; i < palabraOculta.length; i++) {
			System.out.print(palabraOculta[i]+" ");
		}
		System.out.println(" ");
	}
	public void vidasRestantes () {

	}
	public boolean win() {
		boolean result = false;
		victoria=false;
		int contador=0;
		for (int i = 0; i < palabraOculta.length; i++) {
			if (!palabraOculta[i].equals("_")){
				contador++;
				if (contador== palabraOculta.length) {
					result=true;
					victoria=true;
				}
			}
		}
		return result;
	}
	public void comprobarResultado(String entrada) {
		boolean salida=false;
		if (entrada.length()==palabra.length()) {
			if (entrada.equalsIgnoreCase(palabra)){
				salida=true;
				this.win();
			}
		} else {
			if(entrada.length()==1) {
				for (int i = 0; i < palabra.length(); i++) {
					if (entrada.toCharArray()[0]==palabra.toCharArray()[i]) {
						salida=true;
						palabraOculta[i]=entrada;
					}
				}
			}
		}
	}
}
