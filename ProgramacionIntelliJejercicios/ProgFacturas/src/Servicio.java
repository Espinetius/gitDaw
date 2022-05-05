public class Servicio {
	protected String viaje;
	protected double precio;
	public Servicio() {
		this("Lista de viajes",0.00);
	}
	public Servicio(String viaje, double precio) {
		this.viaje=viaje;
		this.precio=precio;
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

	@Override
	public String toString() {
		return "-" + viaje + " -- " + precio + " €";
	}
}
