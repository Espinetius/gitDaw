public class Cerdo extends Animal {
    private String raza;
    //----------------------------CONSTRUCTORES----------------------
    public Cerdo() {
        //super();
        /*super("cerdo","blanco",8,4);
        sano = false;
        raza = "programador";*/
        this("cerdo","blanco",8,4,"desconocida");
    }
    public Cerdo(String nombre, String color, int nacimiento, float peso, String raza) {
        super(nombre,color,nacimiento,peso);
        this.raza = raza;
    }
    //--------------------getter(obtener los valores de los atributos)----------------------

    public String getRaza() { return raza;}
    //--------------------setter(cambiar valores de los atributos)------------------
    public void setRaza(String raza) {this.raza=raza;}
    //--------------------------metodos
    public String toString() {
        return super.toString()+
                ", raza=" +
                '}';
    }
}

