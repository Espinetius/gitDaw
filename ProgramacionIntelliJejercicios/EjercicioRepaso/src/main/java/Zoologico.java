/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Zoologico extends CentroOcio{
    protected boolean delfinario;
    protected boolean pinguinos;
    public Zoologico() {
        super();
        delfinario=true;
        pinguinos=true;
    }
    public Zoologico(int identificador, String nombre, double precioEntrada, String provincia, int anyoConstruccion, int valoracionesUsuarios, boolean delfinario, boolean pinguinos){
        super();
        this.delfinario=delfinario;
        this.pinguinos=pinguinos;
    }

    public boolean isDelfinario() {
        return delfinario;
    }

    public void setDelfinario(boolean delfinario) {
        this.delfinario = delfinario;
    }

    public boolean isPinguinos() {
        return pinguinos;
    }

    public void setPinguinos(boolean pinguinos) {
        this.pinguinos = pinguinos;
    }
    public double calcularEntrada(int edad, boolean festivo){
        double entradaZoo= super.precioEntrada;
        if (edad>65){
            entradaZoo=0;
        } else{
            if (festivo) {
                entradaZoo=entradaZoo+entradaZoo*0.40;
            }
        }
        return entradaZoo;
    }
}
