
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prog
 */
public class Direccion {
    protected String localidad;
    public Direccion() {
        String ciudades[] = new String[4];
        ciudades[0]="Barcelona";
        ciudades[1]="Madrid";
        ciudades[2]="Malaga";
        ciudades[3]="Valencia";
        localidad=ciudades[(int)(Math.random()*4)];
    }
    public Direccion (String localidad) {
        this.localidad=localidad;
    }
    @Override
    public String toString() {
        return localidad;
    }
}
