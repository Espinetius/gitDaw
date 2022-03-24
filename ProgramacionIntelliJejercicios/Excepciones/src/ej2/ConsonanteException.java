package ej2;

public class ConsonanteException extends Exception{
	public ConsonanteException() {
		super("Consonante");
	}
	public ConsonanteException(char letra) {
		super("Es Consonante");
	}
}
