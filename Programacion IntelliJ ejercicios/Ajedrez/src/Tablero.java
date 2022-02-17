public class Tablero {
	Pieza tablero[][]=new Pieza[8][8];
	public Tablero() {
		tablero[0][0] = new Torre("negro");
		tablero[0][1] = new Caballo("negro");
		tablero[0][2] = new Alfil("negro");
		tablero[0][3] = new Reina("negro");
		tablero[0][4] = new Rey("negro");
		tablero[0][5] = new Alfil("negro");
		tablero[0][6] = new Caballo("negro");
		tablero[0][7] = new Torre("negro");

		tablero[7][0] = new Torre("blanco");
		tablero[7][1] = new Caballo("blanco");
		tablero[7][2] = new Alfil("blanco");
		tablero[7][3] = new Reina("blanco");
		tablero[7][4] = new Rey("blanco");
		tablero[7][5] = new Alfil("blanco");
		tablero[7][6] = new Caballo("blanco");
		tablero[7][7] = new Torre("blanco");
	}
	public void pintartablero() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (tablero[i][j]!=null) {
					System.out.print(tablero[i][j].toString());
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public boolean hayPieza(int fila, int columna) {
		boolean respuesta = false;
		for (int i = 0; i < 8 && !respuesta; i++) {
			for (int j = 0; j < 8 && !respuesta; j++) {
				if (tablero[fila][columna]!=null) {
					respuesta = true;
				}
			}
		}
		return respuesta;
	}
	public boolean hayPieza(Posicion pos) {
		boolean respuesta =false;
		for (int i = 0; i < 8 && !respuesta; i++) {
			for (int j = 0; j < 8 && !respuesta; j++) {
				if (tablero[pos.getFila()][pos.getColumna()]!=null) {
					respuesta=true;
				}
			}
		}
		return respuesta;
	}
	public boolean hayPiezasEntre(Movimiento mov) {
		boolean respuesta = false;
		for (int i = mov.posInicial.fila; i <= mov.posFinal.fila && !respuesta; i++) {
			for (int j = mov.posInicial.columna; j <= mov.posFinal.columna && !respuesta; j++) {
				if (tablero[i][j]!=null) {
					respuesta=true;
				}
			}
		}
		return respuesta;
	}
	public void ponPieza(Pieza figura, int fila, int columna) {
		tablero[fila][columna]=figura;
	}
	public void ponPieza(Pieza figura, Posicion pos) {
		tablero[pos.getFila()][pos.getColumna()]=figura;
	}
	public void quitarPieza(int fila, int columna) {
		tablero[fila][columna]=null;
	}
	public void quitarPieza(Posicion pos) {
		tablero[pos.getFila()][pos.getColumna()]=null;
	}
	public Pieza devuelvePieza(int fila, int columna) {
		return tablero[fila][columna];
	}
	public Pieza devuelvePieza(Posicion pos) {
		return tablero[pos.getFila()][pos.getColumna()];
	}
}
