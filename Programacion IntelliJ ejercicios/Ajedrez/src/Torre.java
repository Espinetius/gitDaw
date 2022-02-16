public class Torre extends Pieza{

    public Torre(String color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
       boolean respuesta=false;
       if (mov.esVertical()||mov.esHorizontal()) {
           respuesta=true;
       }
       return respuesta;
    }
    public String pintarPieza() {
        return nombre="Torre";
    }

    @Override
    public String toString() {
        String pieza;
        if (color.equalsIgnoreCase("blanco")){
            pieza="\u2656 ";
        } else {
            pieza="\u265C ";
        }
        return pieza;
    }
}
