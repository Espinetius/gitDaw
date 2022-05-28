public class Servicio {

	protected String viaje;
	protected double precio;
	protected Fecha fecha;
	public Servicio() {
		this("Lista de viajes",0.00, new Fecha());
	}
	public Servicio(String viaje, double precio, Fecha fecha) {
		this.viaje=viaje;
		this.precio=precio;
		this.fecha=fecha;
	}

	public String getViaje() {
		return viaje;
	}

	public void setViaje(String viaje) {
		this.viaje = viaje;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "- " + fecha+ "\"" + viaje + " -- " + precio + " €";
	}
}
