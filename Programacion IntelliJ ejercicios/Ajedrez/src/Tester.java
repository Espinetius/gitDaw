import java.util.Scanner;

/**
 * tester de la aplicacion. Aqui se llamaran las clases y metodos del programa
 */
public class Tester {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        Juego juego = new Juego();
        Tablero tablero = new Tablero();
        Juego jugadaTurno = new Juego();
        do {
            tablero.pintartablero();
            System.out.println(jugadaTurno.newTurno());
            System.out.println("Introduzca el movmiento");
            Movimiento mov = jugadaTurno.jugada(lector.nextLine(), tablero);
            while(mov==null) {
                System.out.println("Reintroduzca la jugada");
                mov = jugadaTurno.jugada(lector.nextLine(), tablero);
            }
            if (tablero.devuelvePieza(mov.posInicial).validoMovimiento(mov)) {
                if (!tablero.hayPiezasEntre(mov) || tablero.devuelvePieza(mov.posInicial.fila, mov.posInicial.columna).getClass().getSimpleName().equalsIgnoreCase("caballo")) {
                    tablero.ponPieza(tablero.devuelvePieza(mov.posInicial), mov.posFinal);
                    tablero.quitarPieza(mov.posInicial);
                }
            } else {
                if (tablero.hayPiezasEntre(mov)) {
                    System.out.println("No se puede realizar ese movimiento, hay piezas de por medio.");
                }
                if (!tablero.devuelvePieza(mov.posInicial).validoMovimiento(mov)) {
                    System.out.println("Movimiento no valido");
                }
            }
        } while (juego.juegoActivo());
    }
}
