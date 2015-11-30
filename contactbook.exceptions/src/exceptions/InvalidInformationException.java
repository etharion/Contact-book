package exceptions;

/**
 * Default-implementeret exception som benyttes n�r en information er ugyldig.
 * 
 */
@SuppressWarnings("serial")
public class InvalidInformationException extends Exception {
	public InvalidInformationException(String message) {
		super(message);
	}
}