public class Torre extends Pieza{

    public Torre(String color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
       boolean respuesta=false;
       if (mov.esVertical()||mov.esVertical()) {
           respuesta=true;
       }
       return true;
    }
    public String pintarPieza() {
        return nombre="Torre";
    }

    @Override
    public String toString() {
        return super.toString() + " " + pintarPieza();
    }
}
