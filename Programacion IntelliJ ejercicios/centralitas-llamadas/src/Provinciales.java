public class Provinciales extends Llamadas{
    protected int franja;
    public Provinciales() {
        franja= (int) (Math.random()*3);
    }
    public Provinciales(int franja) {
        this.franja=franja;
    }

    public Provinciales(int numEntr, int numDest, double tiempo, int franja) {
        super(numEntr, numDest, tiempo);
        this.franja=franja;
    }

    @Override
    public double precio() {
        double calculo;
        if (franja==1)
            calculo= tiempo*20;
        else if (franja==2)
            calculo=tiempo*25;
        else
            calculo=tiempo*30;
        return calculo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "franja=" + franja +
                "precio=" + precio()/tiempo +
                '}';
    }
}
