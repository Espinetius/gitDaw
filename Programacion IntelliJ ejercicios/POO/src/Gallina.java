public class Gallina extends  Animal {
    //--------------atributos 
    private String raza; //ligera, mediana o pesada
    private boolean ponedora;
    private boolean produccioncarne;

    public Gallina() {
        //this("sin nombre", "sin color", 0, 0, true, true, true);
        super("sin nombre", "sin color", 0, 0);
        raza = "ligera";
        ponedora = true;

    }

    //------------------- constructor con entrada de datos por teclado
    public Gallina(String nombre, String color, int edad, float peso, String raza) {
        super(nombre, color, edad, peso);
        this.raza = raza;
        if (raza.equalsIgnoreCase("ligera")) {
            ponedora = true;
        }
        if (raza.equalsIgnoreCase("mediana")) {
            ponedora = true;
            produccioncarne = true;
        }
        if (raza.equalsIgnoreCase("pesada")) {
            produccioncarne = true;
        }
    }

    public String toString() {
        return super.toString() +
                ", raza=" + raza +
                "ponedora=" + ponedora +
                "da carne=" + produccioncarne +
                '}';
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPonedora() {
        return ponedora;
    }

    public void setPonedora(boolean ponedora) {
        this.ponedora = ponedora;
    }

    public boolean isProduccioncarne() {
        return produccioncarne;
    }

    public void setProduccioncarne(boolean produccioncarne) {
        this.produccioncarne = produccioncarne;
    }
}
