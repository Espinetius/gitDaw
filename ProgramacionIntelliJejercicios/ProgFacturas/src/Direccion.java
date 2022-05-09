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

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return calle + " " + numero + " " + piso + ", " + ciudad;
	}
}
