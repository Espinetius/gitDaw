public abstract class Llamadas {
    /**
     * atributos de la clase llamadas.
     * el precio sera en centimos
     * el tiempo es opr segundos.
     */
    protected int numEntr;
    protected int numDest;
    protected double tiempo;


    /**
     * constructor base para llamadas
     */
    public Llamadas() {
        this(50);

    }

    /**
     * constructor especifico de llamdas segun el tiempo
     */
    public Llamadas(double tiempo) {
        numEntr=(int)(Math.random()*100000000);
        numDest=(int)(Math.random()*100000000);
        this.tiempo = tiempo;

    }

    public Llamadas(int numEntr, int numDest, double tiempo) {
        this.numEntr = numEntr;
        this.numDest = numDest;
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "numEntr=" + numEntr +
                ", numDest=" + numDest +
                ", tiempo=" + tiempo;
    }

    public abstract double precio();

}
