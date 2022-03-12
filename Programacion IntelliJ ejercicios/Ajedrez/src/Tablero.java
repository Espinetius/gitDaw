public class Tablero {
	Pieza tablero[][]=new Pieza[8][8];
	public Tablero() {
		tablero[0][0] = new Torre("blanco");
		tablero[0][1] = new Caballo("blanco");
		tablero[0][2] = new Alfil("blanco");
		tablero[0][3] = new Reina("blanco");
		tablero[0][4] = new Rey("blanco");
		tablero[0][5] = new Alfil("blanco");
		tablero[0][6] = new Caballo("blanco");
		tablero[0][7] = new Torre("blanco");
		for (int i = 0; i < 8; i++) {
			tablero[1][i] = new Peon ("blanco");
		}
		tablero[7][0] = new Torre("negro");
		tablero[7][1] = new Caballo("negro");
		tablero[7][2] = new Alfil("negro");
		tablero[7][3] = new Reina("negro");
		tablero[7][4] = new Rey("negro");
		tablero[7][5] = new Alfil("negro");
		tablero[7][6] = new Caballo("negro");
		tablero[7][7] = new Torre("negro");
		for (int i = 0; i < 8; i++) {
			tablero[6][i] = new Peon ("negro");
		}
	}
	public void pintartablero() {
		System.out.println(" |\tA\tB\tC\tD\tE\tF\tG\tH\t|");
		System.out.println("-| -- -- -- -- -- -- -- -- -- -- -- |");
		for (int i = 0; i < 8; i++) {
			System.out.print(i+1+"|\t");
			for (int j = 0; j < 8; j++) {
				if (tablero[i][j]!=null) {
					System.out.print(tablero[i][j].toString()+"\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("|");
		}
		System.out.println("-| -- -- -- -- -- -- -- -- -- -- -- |");
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
		int aux;
		int filamenor = mov.posInicial.fila;
		int filamayor = mov.posFinal.fila;
		int colmenor = mov.posInicial.columna;
		int colmayor = mov. posFinal.columna;
		if (mov.esVertical()) {
			if (filamenor > filamayor) {
				aux = filamenor;
				filamenor = filamayor;
				filamayor = aux;
			}
			for (int i = filamenor +1 ; i < filamayor && !respuesta; i++) {
				if (tablero!=null) {
					respuesta = true;
				}
			}
		} else if (mov.esHorizontal()) {
			if (colmenor>colmayor) {
				aux = colmenor;
				colmenor=colmayor;
				colmayor = aux;
			}
			for (int i = colmenor + 1; i < colmayor && !respuesta; i++) {
				if (tablero!=null) {
					respuesta=true;
				}
			}
		} else if (mov.esDiagonal()) {
			if (mov.posInicial.fila < mov.posFinal.fila) {
				if (mov.posInicial.columna < mov.posFinal.columna) {
					for (int i = mov.posInicial.fila, j = mov.posInicial.columna; i < mov.posFinal.fila && j < mov.posFinal.columna && !respuesta; i++, j++) {
						if (tablero != null) {
							respuesta = true;
						}
					}
				} else if (mov.posInicial.columna > mov.posFinal.columna) {
					for (int i = mov.posInicial.fila, j = mov.posInicial.columna; i < mov.posFinal.fila && j > mov.posFinal.columna && !respuesta; i++, j--) {
						if (tablero != null) {
							respuesta = true;
						}
					}
				}
			} else if (mov.posInicial.fila > mov.posFinal.fila) {
				if (mov.posInicial.columna < mov.posFinal.columna) {
					for (int i = mov.posInicial.fila, j = mov.posInicial.columna; i > mov.posFinal.fila && j < mov.posFinal.columna && !respuesta; i--, j++) {
						if (tablero != null) {
							respuesta = true;
						}
					}
				} else if (mov.posInicial.columna > mov.posFinal.columna) {
					for (int i = mov.posInicial.fila, j = mov.posInicial.columna; i > mov.posFinal.fila && j > mov.posFinal.columna && !respuesta; i--, j--) {
						if (tablero != null) {
							respuesta = true;
						}
					}

				}
			}
		}
		return respuesta;
	}
	public boolean movValido(int fila, int columna, int turno) {
		if (turno%2==0 && !tablero[fila][columna].getColor().equalsIgnoreCase("blanco") || turno%2!=0 && !tablero[fila][columna].getColor().equalsIgnoreCase("negro")) {
			return true;
		}
		return false;
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
