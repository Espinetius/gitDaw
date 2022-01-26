public class Animal {
    protected String nombre;
    protected String color;
    protected int nacimiento;
    protected float peso;
    protected boolean sano;
    protected static int numanimales;
    private int idanimal;
    public Animal() {
        //this.("sin nombre"+numanimales, "sin color", 0, 0, true);
        nombre="sin nombre";
        color="sin color";
        numanimales++;
        idanimal=numanimales;
    }
    public Animal(String nombre, String color, int nacimiento, float peso, boolean sano) {
        this.nombre = nombre;
        this.color = color;
        this.nacimiento = nacimiento;
        this.peso = peso;
        this.sano=sano;
        numanimales++;
        idanimal=numanimales;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+numanimales+"{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", nacimiento=" + nacimiento +
                ", peso=" + peso +
                ", sano=" + sano +
                ", idanimal=" + idanimal +
                '}';
    }

    public String getNombre() {
        return nombre;
    }
    public String getColor() {
        return color;
    }
    public int getNacimineto() {
        return nacimiento;
    }
    public float getPeso() {
        return peso;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setNacimineto(int nacimineto) {
        this.nacimiento =nacimineto;
    }
    public void setPeso(float peso){
        this.peso=peso;
    }

    public static int getNumanimales() {
        return numanimales;
    }
    public static void setNumanimales(int numanimales) {
        Animal.numanimales = numanimales;
    }
    public int getIdanimal() {
        return idanimal;
    }
    public void setSano(boolean sano) {this.sano=sano;}

    public boolean getSano() { return sano;}

}
