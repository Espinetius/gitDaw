public class Ejemplovaca extends Animal {
    private boolean lechera;
    private String calidad; //baja,media,alta
    //----------------------------CONSTRUCTORES----------------------

    public Ejemplovaca() {
        this("vaca"+numanimales,"color",1,1,true,false,"baja");
    }
    public Ejemplovaca(String nombre, String color, int nacimiento, float peso,boolean sano, boolean lechera, String quality) {
        super(nombre, color, nacimiento, peso, sano);
        this.lechera = lechera;
        calidad = quality;
    }

     //override sale cuando el metodo se reformule y no se use el del padre, en este caso la clase objeto
    public String vacadefinida() {
        return "ejemplovaca{" +
                ", lechera=" + lechera +
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
