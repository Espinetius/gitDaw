package ej2;

public class VocalExpection extends Exception{
	public VocalExpection() {
		super("Vocal");
	}
	public VocalExpection(char letra) {
		super("Es Vocal");
	}
}
