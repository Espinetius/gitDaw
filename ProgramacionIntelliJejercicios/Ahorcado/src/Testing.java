import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Testing {
	protected static ArrayList<Integer> dificultades;
	public static ArrayList<Integer> diffValidas() {
		Scanner lector;
		int dificultad;
		dificultades = new ArrayList<>();
		try {
			lector = new Scanner(new File(Diccionario.nombreFichero));
			while (lector.hasNextLine()){
				dificultad= Integer.parseInt(lector.nextLine().split(" ; ")[1]);
				for (int i = 0; i < dificultades.size(); i++) {
					if (dificultades.get(i)!=dificultad) {
						dificultades.add(dificultad);
					}
				}
				dificultades.add(dificultad);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.getMessage();
		}
		return dificultades;
	}
	public static void diffNull(int diff) throws ExepcionPropia{
		diffValidas();
		if (!dificultades.contains(diff)) {
			throw new ExepcionPropia(diff);
		};
	}
	public static void diffNull(String diff) throws ExepcionPropia{
		diffValidas();
		if (!dificultades.contains(diff)) {
			throw new ExepcionPropia(diff);
		};
	}
}
