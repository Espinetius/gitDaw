public class Empresa {
	protected String nombreEmpresa;
	protected String NIF;

	/**
	 * Constructor para crear linea de empresa vacia y NIF vacio.
	 */
	public Empresa(){
		this("Nombre de la empresa", "NIF de la empresa");
	}

	/**
	 * Constructor para crear linea de empresa a traves de un nombre de empresa y un NIF.
	 * @param nombreEmpresa
	 * @param NIF
	 */
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
		return "Empresa: " + nombreEmpresa + '\'' + NIF + '\'' +
				'.';
	}
}
