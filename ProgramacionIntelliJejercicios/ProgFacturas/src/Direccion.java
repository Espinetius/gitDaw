public class Direccion {
	protected String calle;
	protected  int numero;
	protected String piso;
	protected String ciudad;
	public Direccion() {
		this("calle", 00, "S/N", "Ciudad");
	}
	public Direccion(String calle, int numero, String piso, String ciudad){
		this.calle=calle;
		this.numero=numero;
		this.piso=piso;
		this.ciudad=ciudad;
	}

	@Override
	public String toString() {
		return calle + " " + numero + " " + piso + ", " + ciudad;
	}
}
