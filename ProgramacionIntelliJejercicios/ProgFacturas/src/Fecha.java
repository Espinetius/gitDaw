public class Fecha {
	protected int dia;
	protected int mes;
	protected int año;
	public Fecha() {
		this(00,00,0000);
	}
	public Fecha(int dia, int mes, int año) {
		this.dia=dia;
		this.mes=mes;
		this.año=año;
	}

	@Override
	public String toString() {
		return dia+"\""+mes+"\""+año;
	}
}
