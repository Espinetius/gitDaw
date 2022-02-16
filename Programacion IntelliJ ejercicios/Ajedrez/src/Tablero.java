public class Tablero {
	Pieza tablero[][]=new Pieza[8][8];
	public Tablero() {
		tablero[0][0] = new Torre("negro");
		tablero[1][0] = new Caballo("negro");
		tablero[2][0] = new Alfil("negro");
		tablero[3][0] = new Reina("negro");
		tablero[4][0] = new Rey("negro");
		tablero[5][0] = new Alfil("negro");
		tablero[6][0] = new Caballo("negro");
		tablero[7][0] = new Torre("negro");

		tablero[7][7] = new Torre("blanco");
		tablero[7][6] = new Caballo("blanco");
		tablero[7][5] = new Alfil("blanco");
		tablero[7][4] = new Reina("blanco");
		tablero[7][3] = new Rey("blanco");
		tablero[7][2] = new Alfil("blanco");
		tablero[7][1] = new Caballo("blanco");
		tablero[7][]
	}
}
