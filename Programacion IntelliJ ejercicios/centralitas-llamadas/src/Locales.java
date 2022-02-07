public class Locales extends Llamadas{
    /**
     * el precio esta definido en el ejercicio
     */
    protected double precio;

    /**
     * el precio es de 15 centimos/sec
     */
    public Locales(){
        precio=15;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public double precio() {
        return 15*tiempo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "precio=" + 15 +
                '}';
    }
}
