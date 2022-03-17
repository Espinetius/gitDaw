/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prog
 */
public class ParqueAtracciones extends CentroOcio{
    protected int edadmin;
    protected double precio = Math.random()*11+15;

    public void setEdadmin(int edadmin) {
        this.edadmin = edadmin;
    }

    public int getEdadmin() {
        return edadmin;
    }
    
    public ParqueAtracciones() {
        this(1, "holahola", Math.random()*11+15, new Direccion(), 2000, 15);
    }
    public ParqueAtracciones(int id, String nombre, double entrada, Direccion prov, int constru, int edadmin) {
        super(id, nombre, entrada, prov ,constru);
        this.edadmin=edadmin;
    }
    public ParqueAtracciones(int edad) {
        setEdadmin(edad);
    }
    public double PrecioReal(int edad, boolean festivo){
        double precio = Math.random()*11+15;
        if (edad<65) {
            if (festivo==true) {
                precio = precio*1.4;
            }
        } else {
            precio = 0;
        }
        return precio;
    }
    public String toString() {
        return "Datos:\n" + this.getClass() + ": " + super.nombre +
                "\nID: " + super.getIdentificador() +
                "\nProvincia: " + super.getProvincia() +
                "\nConstruido en: " + super.getAnyoConstruccion() +
                "\nEdad minima para acceder: " + edadmin +
                "\nPrecio normal= " + precio;
        
    }
}
