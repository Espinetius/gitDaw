import java.util.Scanner;

public class Tester {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        Tablero tablero = new Tablero();
        tablero.pintartablero();
        Juego jugadaTurno = new Juego();
        System.out.println("Introduce Jugada");
        Movimiento mov=jugadaTurno.jugada(lector.nextLine(), tablero);
        if (tablero.devuelvePieza(mov.posInicial).validoMovimiento(mov)) {
            tablero.ponPieza(tablero.devuelvePieza(mov.posInicial), mov.posFinal);
            tablero.quitarPieza(mov.posInicial);
        }
        tablero.pintartablero();
    }
}
