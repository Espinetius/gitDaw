import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Testing {
	protected static ArrayList<Integer> dificultades;
	public static ArrayList<Integer> diffValidas() {
		Scanner lector;
		dificultades = new ArrayList<>();
		try {
			lector = new Scanner(new File(Diccionario.nombreFichero));
			while (lector.hasNextLine()){
				dificultades.add(lector.nextInt());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return dificultades;
	}
	public static void diffNull(int diff) throws ExepcionPropia{
		diffValidas();
		if (!dificultades.contains(diff)) {
			throw new ExepcionPropia(diff);
		};
	}
}
