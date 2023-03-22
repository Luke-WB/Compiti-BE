package errori;

public class BancaException extends Exception {
    String message;

    public BancaException(String s) { // METODO CHE RESTITUISCE VALORE DI MSG
	message = s.toString();

    }
}
