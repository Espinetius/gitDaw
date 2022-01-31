public class Granja {
    public static final String granja = "1ª Daw";
    protected Animal animales[];

    public Granja() {
        animales = new Animal[100];
        for (int i = 0; i < animales.length/4; i++) {
            animales[i] = new Vaca();
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
    public boolean hayHueco() {
        boolean hayHueco=false;
        for (int i = 0; i < animales.length && !hayHueco; i++) {
            if (animales[i]==null) {
                hayHueco=true;
            }
        }
        return hayHueco;
    }
    public Animal[] getAnimales() {
        return animales;
    }
    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

}
