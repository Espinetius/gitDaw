import java.sql.Array;
import java.util.Scanner;

public class Juego {
    protected int turno=1;
    public int getTurno() {
        return turno;
    }
    /*public void setTurno(int turno) {
        this.turno = turno;
    }*/
    public Movimiento jugada(String jugadaString, Tablero tablero) {
        Movimiento mov= null;
        int[] jugadaArray =new int[jugadaString.length()];
        jugadaArray[0] = jugadaString.charAt(1)-49;//fila inicial
        jugadaArray[1] = jugadaString.charAt(0)-65;//col inicial
        jugadaArray[2] = jugadaString.charAt(3)-49;//fila final
        jugadaArray[3] = jugadaString.charAt(2)-65; //col final
        //Hasta que no esté todo ok no creo mov
        Posicion ini = new Posicion(jugadaArray[0],jugadaArray[1]);
        Posicion fin = new Posicion(jugadaArray[2],jugadaArray[3]);
        mov = new Movimiento(ini, fin);
        turno++;
        return mov;
    }
}