/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public abstract class CentroOcio {
    protected int identificador;
    protected String nombre;
    protected double precioEntrada;
    protected String provincia;
    protected int anyoConstruccion;
    protected int valoracionesUsuarios;
    public CentroOcio(){
        this(0,"centroPrueba", 0.00, "Madrid", 2022, 5);
    }
    public CentroOcio(int identificador, String nombre, double precioEntrada, String provincia, int anyoConstruccion, int valoracionesUsuarios){
        this.identificador=identificador;
        this.nombre=nombre;
        this.precioEntrada=precioEntrada;
        this.provincia=provincia;
        this.anyoConstruccion=anyoConstruccion;
        this.valoracionesUsuarios=valoracionesUsuarios;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getAnyoConstruccion() {
        return anyoConstruccion;
    }

    public void setAnyoConstruccion(int anyoConstruccion) {
        this.anyoConstruccion = anyoConstruccion;
    }

    public int getValoracionesUsuarios() {
        return valoracionesUsuarios;
    }

    public void setValoracionesUsuarios(int valoracionesUsuarios) {
        this.valoracionesUsuarios = valoracionesUsuarios;
    }
    public abstract double calcularEntrada(int edad, boolean festivo);
}
