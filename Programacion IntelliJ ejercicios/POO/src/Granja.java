import java.util.Arrays;

public class Granja {
    public static final String granja = "1ª Daw";
    protected static Animal[] animales;


    public Granja() {
        animales = new Animal[10];
        for (int i = 0; i < animales.length/5; i++) {
            animales[i] = new Animal();
        }
    }

    public Granja(int total) {
        animales = new Animal[total];
        for (int i = 0; i < total; i++) {
            animales[i] = EntradaDatos.animales((int)(Math.random()*7+1));
        }
    }
    public Granja(Animal[] animales) {
        this.animales=animales;
    }
    public void altaAnimal(Animal animal){
        boolean next=false;
        for (int i = 0; i < animales.length && !next; i++) {
            if (animales[i]==null) {
                animales[i] = animal;
                next=true;
            }
        }
    }
    public void bajaAnimal(int numanimal) {
            if (animales[numanimal]!=null) {
                animales[numanimal] = null;
            }

    }
    public boolean hayHueco() {
        boolean hayHueco=false;
        for (int i = 0; i < animales.length && !hayHueco; i++) {
            if (animales[i]==null) {
                hayHueco=true;
            }
        }
        return hayHueco;
    }

    public String listaAnimales() {
        return "Granja{" +
                "\nAnimales:" +
                "\n" + Arrays.toString(getAnimales()) +
                '}';
    }

    public Animal[] getAnimales() {
        return animales;
    }
    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

}
