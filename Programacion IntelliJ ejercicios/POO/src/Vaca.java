public class Vaca extends Animal {
    private boolean lechera;
    private String calidad; //baja,media,alta
    //----------------------------CONSTRUCTORES----------------------

    public Vaca() {
        this("vaca","color",1,1,false);
    }
    public Vaca(String nombre, String color, int nacimiento, float peso, boolean lechera) {
        super(nombre, color, nacimiento, peso);
        this.lechera = lechera;

    }
    private String toStringLechera() {
        String cadena;
        if (lechera) {
            cadena="si";
        } else {
            cadena = "no";
        }
        return cadena;
    }
     //override sale cuando el metodo se reformule y no se use el del padre, en este caso la clase objeto

    public String toString() {
        return super.toString()+
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
