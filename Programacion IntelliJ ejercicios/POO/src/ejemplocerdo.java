public class ejemplocerdo extends animal {
    private boolean sano;
    private String raza;

    //----------------------------CONSTRUCTORES----------------------

    public ejemplocerdo () {
        super();
        sano = false;
        raza = "programador";

    }
    public ejemplocerdo (String nombre, String color, int nacimiento, float peso, boolean sano, String raza) {
        super(nombre,color,nacimiento,peso);
        this.sano = sano;
        this.raza = raza;
    }

    //override sale cuando el metodo se reformule y no se use el del padre, en este caso la clase objeto
    public String cerdodefinido() {
        return "ejemplocerdo{" +
                "granja=" + granja + '\'' +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + nacimiento +
                ", peso=" + peso +
                ", sano=" + sano +
                ", raza=" + raza +
                '}';
    }
    //--------------------getter(obtener los valores de los atributos)----------------------
    public String getNombre() {
        return nombre;
    }
    public String getColor() {
        return color;
    }
    public int getNacimiento() {
        return nacimiento;
    }
    public float getPeso() {
        return peso;
    }
    public boolean getSano() { return sano;}
    public String getRaza() { return raza;}
    //--------------------setter(cambiar valores de los atributos)------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }
    public void setPeso(float peso){
        this.peso=peso;
    }
    public void setSano(boolean sano) {this.sano=sano;}
    public void setRaza(String raza) {this.raza=raza;}
}

