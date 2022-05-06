public class Empresa {
	protected String nombreEmpresa;
	protected String NIF;
	protected int telefono;
	protected Direccion direccion;

	/**
	 * Constructor para crear linea de empresa vacia y NIF vacio.
	 */
	public Empresa(){
		this("Nombre de la empresa", "NIF de la empresa", 000000000, new Direccion());
	}

	/**
	 * Constructor para crear linea de empresa a traves de un nombre de empresa, un NIF, un telefono y una direccion
	 * @param nombreEmpresa
	 * @param NIF
	 * @param telefono
	 * @param direccion
	 */
	public Empresa(String nombreEmpresa, String NIF, int telefono, Direccion direccion) {
		this.nombreEmpresa=nombreEmpresa;
		this.NIF=NIF;
		this.telefono=telefono;
		this.direccion=direccion;
	}
	public Empresa(String nombreEmpresa, String NIF) {
		this.nombreEmpresa=nombreEmpresa;
		this.NIF=NIF;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String NIF) {
		this.NIF = NIF;
	}

	@Override
	public String toString() {
		return "Empresa: " + nombreEmpresa +
				"\nNIF: " + NIF +
				"\nTelefono: " + telefono +
				"\nDireccion" + direccion;
	}
}
