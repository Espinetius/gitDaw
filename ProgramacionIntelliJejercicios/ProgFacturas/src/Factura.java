import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.*;
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
		ListaEmpresas listaEmp = new ListaEmpresas();
		try {
			lectorFichero = new Scanner(new File("Listado_Empresas.txt"));
			PrintWriter pw = new PrintWriter(new FileWriter(new File("Listado_Empresas.txt")));
			while(lectorFichero.hasNextLine()) {
				pw.println(lectorFichero.nextLine());
				pw.close();
			}
			while (!salidacliente) {
				for (int i = 0; !salidacliente; i++) {
					if (CIF.equalsIgnoreCase(String.valueOf(listaEmpresas.empresasArraylist.get(i)))) {
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
			} catch (IOException e) {
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
	public void escribirEXCEL(String CIFempresa, String CIFcliente) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca el mes y año, de la factura (ej: mayo/2022)");
		String excel = lector.nextLine();
		String nombreArchivo = excel + ".xlsx";
		String factura = String.valueOf(idFactura);
		XSSFWorkbook libro = new XSSFWorkbook();
		XSSFSheet hoja = libro.createSheet(factura);
		boolean salida = false;
		Servicio servicio = new Servicio();
		servicios= new Servicios();
		for (int i = 0; !salida; i++) {
			System.out.println("Introduzca el servicio realizado: viaje, precio");
			String viaje = lector.nextLine();
			double precio = lector.nextDouble();
			System.out.println("Introduzca dia, mes y año");
			int dia = lector.nextInt();
			int mes = lector.nextInt();
			int año = lector.nextInt();
			lector.nextLine();
			Fecha fecha = new Fecha(dia, mes, año);
			servicio = new Servicio(viaje, precio, fecha);
			servicios.getServicios().add(servicio);
			System.out.println("Quieres añadir mas servicios?");
			String respuesta = lector.nextLine();
			if (respuesta.equalsIgnoreCase("no")) {
				salida = true;
			}
		}
		XSSFRow fila1= hoja.createRow(1);
		XSSFCell celda11 = fila1.createCell(1);
		XSSFCell celda14 = fila1.createCell(4);
		celda11.setCellValue("Logo Empresa");
		celda14.setCellValue("Factura num:"+ idFactura);
		XSSFRow fila2 = hoja.createRow(2);
		XSSFCell celda24 =fila2.createCell(4);
		celda24.setCellValue("Fecha :"+ excel);
		XSSFRow fila5 = hoja.createRow(5);
		XSSFCell celda51 = fila5.createCell(1);
		XSSFCell celda54 = fila5.createCell(4);
		celda51.setCellValue(String.valueOf(seleccionarEmpresa(CIFempresa)));
		celda54.setCellValue(String.valueOf(seleccionarCliente(CIFcliente)));
		XSSFRow fila6 = hoja.createRow(6);
		XSSFCell celda61 = fila6.createCell(1);
		XSSFCell celda62 = fila6.createCell(2);
		XSSFCell celda64 = fila6.createCell(4);
		celda61.setCellValue("Dia");
		celda62.setCellValue("Viaje realizado");
		celda64.setCellValue("Precio");
		for (int j = 0; j < servicios.getServicios().size(); j++) {
			Servicio servicioactual = servicios.getServicios().get(j);
			XSSFRow filaactual = hoja.createRow(7+j);
			XSSFCell celdadia = filaactual.createCell(1);
			XSSFCell celdaviaje = filaactual.createCell(2);
			XSSFCell celdaprecio = filaactual.createCell(4);
			celdadia.setCellValue(servicioactual.getFecha().getDia());
			celdaviaje.setCellValue(servicioactual.getViaje());
			celdaprecio.setCellValue(servicioactual.getPrecio());
		}
		String path = ".\\Facturas\\"+nombreArchivo;
		try {
			FileOutputStream os = new FileOutputStream(path);
			libro.write(os);
			os.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
