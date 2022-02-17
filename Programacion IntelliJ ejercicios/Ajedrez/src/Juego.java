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
        Scanner lector = new Scanner(System.in);
        jugadaString = lector.nextLine();
        int[] jugadaArray =new int[jugadaString.length()];
        for (int i = 0; i < jugadaString.length(); i++) {
            jugadaArray[i]=jugadaString.indexOf(i);
        }
        Posicion ini = new Posicion(jugadaArray[0],jugadaArray[1]);
        Posicion fin = new Posicion(jugadaArray[2],jugadaArray[3]);
        Movimiento jugada = new Movimiento(ini, fin);
        turno++;
        return jugada;
    }
}
