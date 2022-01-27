public class Granja {
    public static final String granja = "1ª Daw";
    private Animal animales;
    protected static int numanimales;
    private int idanimal;

    public Granja() {
        numanimales++;
        idanimal=numanimales;
    }
    public Granja(Animal animal) {
        animales=animal;
        numanimales++;
        idanimal=numanimales;
    }

}
