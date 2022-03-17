public class Oveja extends Animal {
    //---------------atributos
    private boolean lana;
    private boolean queso;
    private String localidad;
    
    //---------------constructores
    public Oveja(){
        this("oveja", "color", 0, 0,true,true,"localidad");

    }
    public Oveja (String nombre, String color, int edad, float peso, boolean lana, boolean queso, String localidad){
        super(nombre,color, edad, peso);
        this.lana=lana;
        this.queso=queso;
        this.localidad=localidad;

    }
    //---------------setter
    public void setLana(boolean lana) {this.lana = lana;}
    public void setQueso(boolean queso) {this.queso = queso;}
    public void setLocalidad(String localidad) {this.localidad = localidad;}
    //---------------getter
    public boolean isLana() {return lana;}
    public boolean isQueso() {return queso;}
    public String getLocalidad() {return localidad;}
    //----------------metodos
    public String toString() {
        return super.toString() +
                ", lana= " + lana +
                ", queso= " +queso +
                ", localidad= " + localidad +
                '}';
    }
    
}
