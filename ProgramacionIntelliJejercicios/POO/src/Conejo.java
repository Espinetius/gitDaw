public class Conejo extends  Animal{
    private String raza;
    private boolean estado; //domestico o no domestico
    //constructores
     public Conejo(){
         this("nombre", "color", 0, 0, "raza", true);
    }
    public Conejo(String nombre, String color,int nacimiento, float peso, String raza, boolean estado) {
        super(nombre,color,nacimiento,peso);
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

    public String toString(){
        return  super.toString()+
                ", raza="+ raza +
                ", estado="+ estado +
                '}';
    }
}
