public class Pato extends Animal{
    //Atributos
    private String calidad; //Alta, Media; Baja
    private boolean genero;
    //Constructores
    public Pato(){
        this("sin nombre", "sin color", 0, 0, true, "alta",true);
    }
    public Pato(String nombre, String color, int nacimiento, float peso, boolean sano, String calidad, boolean genero) {
        super(nombre, color, nacimiento, peso, sano);
        this.calidad=calidad;
        this.genero=genero;
    }
    //Getters (Obtener los atributos privados)
    public String getCalidad(){
        return calidad;
    }
    public String getGenero() {
        String tipoGenero;
        if(genero) {
         tipoGenero = "Macho";   
        }
        else {
            tipoGenero = "Hembra";
        }
        return "El genero del pato es " + tipoGenero;
    }
    //Setters (Sirve para modificar los datos)
    public void setCalidad(String calidad){
        if(calidad.equalsIgnoreCase("Alta")){
            this.calidad = "Alta";
        }
        else if(calidad.equalsIgnoreCase("Media")){
            this.calidad = "Media";
        }
        else{
            this.calidad = "Baja";
        }
    }
    public void setGenero(String genero){
        if(genero.equalsIgnoreCase("Macho")){
            this.genero = true;
        }
        else {
            this.genero = false;
        }
    }
    public String patodefinido() {
        return super.toString()+"{"+
                "calidad="+calidad+
                "genero="+genero+
                '}';
    }
}