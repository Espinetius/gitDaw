public class Toro extends Animal {
    private boolean toreable;
    private String brabura; //baja,media,alta
    //----------------------------CONSTRUCTORES----------------------
    public Toro() {
        this("toro", "color", 1, 1, false, "baja");
    }
    public Toro(String nombre, String color, int edad, float peso, boolean toreable, String brabura) {
        super(nombre, color, edad, peso);
        this.toreable = toreable;
        this.brabura = brabura;
    }

     //override sale cuando el metodo se reformule y no se use el del padre, en este caso la clase objeto
    public String toString() {
        return super.toString()+
                ", toreable=" + toreable +
                ", brabura='" + brabura + '\'' +
                '}';
    }
    //--------------------getter(obtener los valores de los atributos)----------------------
    public boolean getToreable() {
        return toreable;
    }
    public String getBrabura() {
        return brabura;
    }
    //--------------------setter(cambiar valores de los atributos)------------------
    public void setToreable(boolean toreable) {
        this.toreable=toreable;
    }
    public void setBrabura(String brabura){
        this.brabura=brabura;
    }
}
