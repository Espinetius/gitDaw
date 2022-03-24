package ej2;

public class isVocal {
	public static void isVocal(char a) throws VocalExpection, ConsonanteException {
		if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
			throw new VocalExpection(a);
		} else {
			throw new ConsonanteException(a);
		}
	}
}
