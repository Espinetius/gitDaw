public class Vaca extends Animal {
    private boolean lechera;
    private String calidad; //baja,media,alta
    //----------------------------CONSTRUCTORES----------------------

    public Vaca() {
        this("vaca"+numanimales,"color",1,1,true,false,"baja");
    }
    public Vaca(String nombre, String color, int nacimiento, float peso, boolean sano, boolean lechera, String quality) {
        super(nombre, color, nacimiento, peso, sano);
        this.lechera = lechera;
        calidad = quality;
    }
    private String toStringLechera() {
        String cadena;
        if (lechera==true) {
            cadena="si";
        } else {
            cadena = "no";
        }
        return cadena;
    }
     //override sale cuando el metodo se reformule y no se use el del padre, en este caso la clase objeto

    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                ", lechera=" + toStringLechera() +
                ", calidad='" + calidad + '\'' +
                '}';
    }
    //--------------------getter(obtener los valores de los atributos)----------------------
    public boolean getLechera() {
        return lechera;
    }
    public String getCalidad() {
        return calidad;
    }
    //--------------------setter(cambiar valores de los atributos)------------------
    public void setLechera(boolean lechera) {
        this.lechera=lechera;
    }
    public void setCalidad(String calidad){
        this.calidad=calidad;
    }
}
