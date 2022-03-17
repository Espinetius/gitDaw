/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prog
 */
public class Zoologico extends CentroOcio{
    protected boolean delfinario;
    protected boolean pinguinos;
    protected double precio=Math.random()*11+10;
    public void setDelfinario(boolean delfinario) {
        this.delfinario = delfinario;
    }

    public boolean isDelfinario() {
        return delfinario;
    }

    public boolean isPinguinos() {
        return pinguinos;
    }
    
    public Zoologico(){
        this(1, "holocaracolo", Math.random()*11+10, new Direccion(), 2000, true, true);
    }
    public Zoologico(int id, String nombre, double entrada, Direccion prov, int constru, boolean delfinario, boolean pinguinos){
        super();
        this.delfinario=delfinario;
        this.pinguinos=pinguinos;
    }
    public Zoologico(boolean delfinario) {
        setDelfinario(delfinario);
    }
    public double PrecioReal(int edad, boolean festivo){
        double precio=Math.random()*11+10;
        if(edad>=7){
            if(festivo==true) {
                precio = precio*1.30;
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
                "\nDelfinario: " + delfinario +
                "\nPinguinos: " + pinguinos +
                 "\nPrecio: " + precio;
    }
}
