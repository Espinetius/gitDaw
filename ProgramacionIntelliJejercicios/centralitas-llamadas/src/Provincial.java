public class Provincial extends Llamada {
    protected int franja;
    public Provincial() {
        super();
        franja= (int) (Math.random()*3);
    }
    public Provincial(int franja) {
        this.franja=franja;
    }

    public Provincial(double tiempo, int franja) {
        super(tiempo);
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
                ", franja=" + franja +
                ", precio=" + precio()/tiempo +
                '}';
    }
}
