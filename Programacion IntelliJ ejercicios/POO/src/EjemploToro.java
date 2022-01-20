public class EjemploToro extends Animal {
    private boolean toreable;
    private String brabura; //baja,media,alta
    //----------------------------CONSTRUCTORES----------------------

    public EjemploToro() {
        super();
        toreable = false;
        brabura = "baja";
    }
    public EjemploToro(String nombre, String color, int edad, float peso, boolean toreable, String brabura) {
        super(nombre, color, edad, peso);
        this.toreable = toreable;
        this.brabura = brabura;
    }

     //override sale cuando el metodo se reformule y no se use el del padre, en este caso la clase objeto
    public String torodefinido() {
        return "ejemploToro{" +
                "granja=" + granja + '\'' +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + nacimiento +
                ", peso=" + peso +
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
