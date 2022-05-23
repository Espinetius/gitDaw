public class Empresa {
	protected String nombreEmpresa;
	protected String CIF;
	protected int telefono;
	protected Direccion direccion;

	/**
	 * Constructor para crear linea de empresa vacia y NIF vacio.
	 */
	public Empresa(){
		this("Egota S.L.", "B-79938130", 630916381, new Direccion());
	}

	/**
	 * Constructor para crear linea de empresa a traves de un nombre de empresa, un NIF, un telefono y una direccion
	 * @param nombreEmpresa
	 * @param CIF
	 * @param telefono
	 * @param direccion
	 */
	public Empresa(String nombreEmpresa, String CIF, int telefono, Direccion direccion) {
		this.nombreEmpresa=nombreEmpresa;
		this.CIF=CIF;
		this.telefono=telefono;
		this.direccion=direccion;
	}
	public Empresa(String nombreEmpresa, String CIF) {
		this.nombreEmpresa=nombreEmpresa;
		this.CIF=CIF;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String CIF) {
		this.CIF = CIF;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Empresa: " + nombreEmpresa +
				"\nCIF: " + CIF +
				"\nTelefono: " + telefono +
				"\nDireccion: " + direccion +
				"\n----------------------------------------------------------------------------------------------------";
	}
}
