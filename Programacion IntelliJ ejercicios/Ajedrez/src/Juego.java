import groovy.console.ui.SystemOutputInterceptor;

public class Juego {
    /**
     * atributo de la clase juego
     */
    protected int turno;

    /**
     * metodo para saber el turno en el que se encuentra
     * @return
     */
    public int getTurno() {
        return turno;
    }
    /*
    metodo para establecer el turno, no es necesitado por lo que esta comentado y no se usa

    public void setTurno(int turno) {
        this.turno = turno;
    }
    */

    /**
     * metodo de lectura del string de la jugada para realizar el movimiento en el tablero
     * @param jugadaString
     * @param tablero
     * @return
     */
    public Movimiento jugada(String jugadaString, Tablero tablero) {
        Movimiento mov= null;
        int[] jugadaArray =new int[jugadaString.length()];
        jugadaArray[0] = jugadaString.charAt(1)-49;//fila inicial
        jugadaArray[1] = jugadaString.charAt(0)-65;//col inicial
        jugadaArray[2] = jugadaString.charAt(3)-49;//fila final
        jugadaArray[3] = jugadaString.charAt(2)-65; //col final
        //Hasta que no esté todo ok no creo mov
            if (tablero.movValido(jugadaArray[0], jugadaArray[1], getTurno())) {
                tablero.devuelvePieza(jugadaArray[0], jugadaArray[1]);
                Posicion ini = new Posicion(jugadaArray[0], jugadaArray[1]);
                Posicion fin = new Posicion(jugadaArray[2], jugadaArray[3]);
                mov = new Movimiento(ini, fin);
                turno++;

        }
        return mov;
    }

    /**
     * metodo para hacer saber al usuario que turno es dependiendo del color
     * @return
     */
    public String newTurno() {
        String turnoColor;
        if (turno%2==0) {
            turnoColor="Es el turno de las blancas";
        } else {
            turnoColor="Es el turno de las negras";
        }
        return turnoColor;
    }

    /**
     * metodo para que el juego no termine hasta que solo quede un rey
     * @return
     */
    public boolean juegoActivo() {
        boolean respuesta = false;

        return true;
    }
}
