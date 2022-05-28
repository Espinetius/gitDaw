import java.util.ArrayList;

public class Servicios {
	protected ArrayList<Servicio> servicios;
	protected double preciototal;

	public ArrayList<Servicio> getServicios() {
		return servicios;
	}

	public Servicios() {
		servicios = new ArrayList<>();
		servicios.add(new Servicio("Introduzca el viaje aqui", 0.00, new Fecha()));
	}
	public void añadirServicios(Servicio servicio) {
		servicios.add(servicio);
	}
	public void imprimirServicios() {
		for (int i = 0; i < servicios.size(); i++) {
			System.out.println(servicios.get(i));
		}
	}
	public double getPreciototal() {
		return preciototal;
	}
	public double calculoPreciototal() {
		preciototal=0;
		for (int i = 0; i < servicios.size(); i++) {
			preciototal=preciototal+servicios.get(i).precio;
		}
		return preciototal;
	}
}
