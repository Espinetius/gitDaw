public class Torre extends Pieza{
    /**
     * te devuelve el color segun el padre
     * @param color
     */
    public Torre(String color) {
        super(color);
    }

    /**
     * te valida el movimiento de la pieza
     * @param mov
     * @return
     */
    @Override
    public boolean validoMovimiento(Movimiento mov) {
       boolean respuesta=false;
       if (mov.esVertical()||mov.esHorizontal()) {
           respuesta=true;
       }
       return respuesta;
    }

    /**
     * te devuelve el nombre de la pieza
     * @return
     */
    @Override
    public String pintarPieza() {
        return nombre="Torre";
    }

    /**
     * te pinta la pieza segun el color, blanco o negro
     * @return
     */
    @Override
    public String toString() {
        String pieza;
        if (color.equalsIgnoreCase("negro")){
            //pieza="\u2656 ";
            pieza="Tb";
        } else {
            //pieza="\u265C ";
            pieza="Tn";
        }
        return pieza;
    }
}
