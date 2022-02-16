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
					System.out.println(" ");
				}
			}
			System.out.println();
		}
	}
	public boolean hayPieza(int fila, int columna) {
		boolean respuesta = false;
		boolean salida = false;
		for (int i = 0; i < 8 && !salida; i++) {
			for (int j = 0; j < 8 && !salida; j++) {
				if (tablero[fila][columna]!=null) {
					respuesta = true;
					salida = true;
				}
			}
		}
		return respuesta;
	}
	public boolean hayPieza(Posicion pos) {
		boolean respuesta =false;
		boolean salida = false;
		for (int i = 0; i < 8 && !salida; i++) {
			for (int j = 0; j < 8 && !salida; j++) {
				if (tablero[pos.getFila()][pos.getColumna()]!=null) {
					respuesta=true;
					salida=true;
				}
			}
		}
		return respuesta;
	}

}
