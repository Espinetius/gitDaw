public class Conejo extends  Animal{
    private String raza;
    private boolean estado; //domestico o no domestico
    //constructores
     public Conejo(){
         this("nombre", "color", 0, 0, true, "raza", true);
    }
    public Conejo(String nombre, String color,int nacimiento, float peso, boolean sano, String raza, boolean estado) {
        super(nombre,color,nacimiento,peso,sano);
        this.raza = raza;
        this.estado = estado;
    }
    //GETTER
    public String getRaza(){return raza;}
    public boolean getEstado(){return estado;}
    //SETTER
    public void setRaza(String raza){this.raza = raza;}
    public void setEstado(boolean estado){this.estado = estado;}
    //metodos sobreescritura

    public String conejodefinido(){
        return  super.toString()+"{"+
                ", raza="+ raza +
                ", estado="+ estado +
                '}';
    }
}
