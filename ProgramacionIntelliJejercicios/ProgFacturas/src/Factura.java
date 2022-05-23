import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Factura {
	protected ImageIcon logo;
	protected int idFactura;
	protected Empresa empresas;
	protected ListaEmpresas listaEmpresas;
	protected Empresa clientes;


	protected Servicios servicios;
	protected double totalServicios;

	public ImageIcon getLogo() {
		return logo;
	}

	public void setLogo(ImageIcon logo) {
		this.logo = logo;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public Servicios getServicios() {
		return servicios;
	}

	public void setServicios(Servicios servicios) {
		this.servicios = servicios;
	}

	public double getTotalServicios() {
		return totalServicios;
	}

	public void setTotalServicios(double totalServicios) {
		this.totalServicios = totalServicios;
	}

	public Factura() {
		logo = new ImageIcon("logoEgota.jpg");
		idFactura = 000;
		listaEmpresas = new ListaEmpresas();
		empresas=new Empresa();
		clientes = new Empresa();
		totalServicios = 0;
		idFactura++;
	}
	public Factura(String empresa,String CIFcliente, Servicios servicios) {
		boolean salida = false;
		logo= new ImageIcon("logoEgota.jpg");
		idFactura= getIdFactura();
		idFactura++;
		listaEmpresas = new ListaEmpresas();
		empresas = new Empresa();
		clientes = new Empresa();
		servicios = new Servicios();
		this.servicios=servicios;
		totalServicios=servicios.calculoPreciototal();

	}
	public Empresa seleccionarCliente(String CIF) {
		Scanner lector = new Scanner(System.in);
		boolean salidacliente = false;
		Scanner lectorFichero = null;
		try {
			lectorFichero = new Scanner(new File("Listado_Empresas.txt"));
			while (!salidacliente) {
				for (int i = 0; lectorFichero.hasNextLine() && !salidacliente; i++) {
					if (listaEmpresas.empresasArraylist.get(i).getCIF().equalsIgnoreCase(CIF)) {
						clientes = listaEmpresas.empresasArraylist.get(i);
						salidacliente = true;
					}
				}
				if (!salidacliente) {
					System.out.println("La empresa no esta registrada. Registre la empresa primero para poder continuar.");
					String nombreEmpresa;
					int telefono;
					String ciudad;
					System.out.println("Introduce el nombre de la Empresa");
					nombreEmpresa = lector.nextLine();
					System.out.println("Introduce el CIF");
					CIF = lector.nextLine();
					System.out.println("Introduce el telefono de la Empresa");
					telefono = lector.nextInt();
					lector.nextLine();
					System.out.println("Introduce la calle de la Empresa");
					String calle = lector.nextLine();
					System.out.println("Introduce el numero de la Empresa");
					int numero = lector.nextInt();
					lector.nextLine();
					System.out.println("Introduce el piso de la Empresa");
					String piso = lector.nextLine();
					System.out.println("Introduce la ciudad");
					ciudad = lector.nextLine();
					Direccion direccion = new Direccion(calle, numero, piso, ciudad);
					clientes = new Empresa(nombreEmpresa, CIF, telefono, direccion);
					listaEmpresas.añadirEmpresas(clientes);
					System.out.println("Empresa añadida correctamente...");
				}
			}
		}catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			}
		return clientes;
	}
	public Empresa seleccionarEmpresa(String CIF) {
		boolean salida =false;
		try {
			for (int i = 0; i < listaEmpresas.empresasArraylist.size() && !salida; i++) {
				if (listaEmpresas.empresasArraylist.get(i).getCIF().equalsIgnoreCase(CIF)) {
					empresas = listaEmpresas.empresasArraylist.get(i);
					salida = true;
				}
			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		return empresas;
	}
	public void viajesRealizados(Servicio servicio) {
		servicios.añadirServicios(servicio);
	}
	/* Me falta un metodo aqui que sea para crear el excel como tal */
	public void newFactura(String CIFempresa, String CIFcliente) {
		Scanner lector = new Scanner(System.in);
		boolean salida = false;
		Factura newfac = new Factura();
		newfac.seleccionarEmpresa(CIFempresa);
		newfac.seleccionarCliente(CIFcliente);
		while (!salida) {
			System.out.println("Introduce el servicio");
			String viaje = lector.nextLine();
			double precio= lector.nextDouble();
			int dia = lector.nextInt();
			int mes = lector.nextInt();
			int año = lector.nextInt();
			Fecha fecha = new Fecha(dia, mes, año);
			Servicio servicio = new Servicio();
			newfac.viajesRealizados(servicio);
			System.out.println("Desea introducir otro servicio?");
			String opcion = lector.nextLine();
			if (opcion.equalsIgnoreCase("no")) {
				salida = true;
			}
		}
		//Aqui iria la creacion del excel con los datos que tiene este metodo.
		System.out.println("Factura generada...");
	}
}
