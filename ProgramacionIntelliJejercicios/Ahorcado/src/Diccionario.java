public class Diccionario {
	protected Palabra[] diccionario;
	public Diccionario (int n) {
		Palabra[] diccionario = new Palabra[n];
	}
	public void listar () {
		int huecos=0;
		for (int i = 0; i < diccionario.length; i++) {
			if (diccionario[i]!=null) {
				System.out.println(diccionario[i]);
				huecos++;
			}
		}
		System.out.println("Hay "+huecos+" huecos en el diccionario");
	}
}
