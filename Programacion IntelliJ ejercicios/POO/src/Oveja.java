public class Oveja extends Animal {
    //---------------atributos
    private String nombre;
    private String color;
    private static final String[] colores = {"blanca","negro","gris","azul"};
    private boolean lana;
    private boolean queso;
    private String localidad;
    private int nac;
    
    //---------------constructores
    public Oveja(){
        nombre="Dolly";
        color=colores[(int)(Math.random()*5)];
        lana=true;
        queso=false;
        localidad="Madrid";
        nac=2009;
    }
    public Oveja (String nombre, String color, boolean lana, boolean queso, String localidad, int nac){
        this.nombre=nombre;
        this.color=color;
        this.lana=lana;
        this.queso=queso;
        this.localidad=localidad;
        this.nac=nac;
    }
    //---------------setter
    public void setLana(boolean lana) {this.lana = lana;}
    public void setQueso(boolean queso) {this.queso = queso;}
    public void setLocalidad(String localidad) {this.localidad = localidad;}
    public void setNac(int nac) {this.nac = nac;}
    //---------------getter
    public static String[] getColores() {return colores;}
    public boolean isLana() {return lana;}
    public boolean isQueso() {return queso;}
    public String getLocalidad() {return localidad;}
    public int getNac() {return nac;}
    //----------------metodos
    public String ovejadefinida() {
        return "oveja{"+

                '}';
    }
    
}
