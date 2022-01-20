public class animal {
    public static final String granja = "1ª Daw";
    protected String nombre;
    protected String color;
    protected int nacimiento;
    protected float peso;
    public animal () {
        nombre = "Seleccione nombre";
        color = "Seleccione color";
        nacimiento = 0;
        peso = 0;
    }
    public animal (String nombre, String color, int nacimiento, float peso) {
        this.nombre = nombre;
        this.color = color;
        this.nacimiento = nacimiento;
        this.peso = peso;
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

}
