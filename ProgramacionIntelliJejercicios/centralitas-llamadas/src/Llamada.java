public abstract class Llamada {
    /**
     * atributos de la clase llamadas.
     * el precio sera en centimos
     * el tiempo es opr segundos.
     */
    protected String numEntr="123123123";;
    protected String numDest="321321321";
    protected double tiempo;


    /**
     * constructor base para llamadas
     */
    public Llamada() {
        this(50);

    }

    /**
     * constructor especifico de llamdas segun el tiempo
     */
    public Llamada(double tiempo) {
        this.tiempo = tiempo;

    }

    public Llamada(String numEntr, String numDest, double tiempo) {
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
