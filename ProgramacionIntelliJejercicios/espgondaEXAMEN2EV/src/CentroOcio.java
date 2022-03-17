/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prog
 */
public abstract class CentroOcio {
    protected int identificador=0;
    protected String nombre;
    protected double precioEntrada;
    protected Direccion provincia;
    protected int anyoConstruccion;
    
    public int getIdentificador() {
        return identificador;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecioEntrada() {
        return precioEntrada;
    }
    public Direccion getProvincia() {
        return provincia;
    }
    public int getAnyoConstruccion() {
        return anyoConstruccion;
    }
   public CentroOcio() {
       identificador= (int)(Math.random()*100);
       nombre= "centro" + identificador;
       precioEntrada = 10;
       provincia = new Direccion();
       anyoConstruccion = 2000+identificador;
   }
   public CentroOcio(int id, String nombre, double entrada, Direccion prov, int constu) {
     identificador=id;
     this.nombre=nombre;
     precioEntrada=entrada;
     provincia=prov;
     anyoConstruccion=constu;
   }
   public abstract double PrecioReal(int edad, boolean festivo);
   @Override
   public abstract String toString();
   
}
