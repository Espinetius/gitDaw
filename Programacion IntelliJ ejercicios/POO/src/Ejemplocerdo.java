public class Ejemplocerdo extends Animal {
    private String raza;
    //----------------------------CONSTRUCTORES----------------------
    public Ejemplocerdo() {
        //super();
        /*super("cerdo","blanco",8,4);
        sano = false;
        raza = "programador";*/
        this("cerdo"+numanimales,"blanco",8,4,false,"desconocida");
    }
    public Ejemplocerdo(String nombre, String color, int nacimiento, float peso, boolean sano, String raza) {
        super(nombre,color,nacimiento,peso,sano);
        this.raza = raza;
    }

    //override sale cuando el metodo se reformule y no se use el del padre, en este caso la clase objeto
    public String cerdodefinido() {
        return "ejemplocerdo{" +
                ", raza=" + raza +
                '}';
    }
    //--------------------getter(obtener los valores de los atributos)----------------------

    public String getRaza() { return raza;}
    //--------------------setter(cambiar valores de los atributos)------------------
    public void setRaza(String raza) {this.raza=raza;}
}

