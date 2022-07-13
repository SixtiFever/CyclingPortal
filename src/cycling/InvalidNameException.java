package cycling;

/**
 * Thrown when attempting to assign an entity name null, empty or having more than
 * the system limit of characters. A name must be a single word, i.e., no
 * white spaces allowed.
 * 
 * @author Diogo Pacheco
 * @version 1.1
 *
 */
public class InvalidNameException extends Exception {

	/**
	 * Constructs an instance of the exception with no message
	 */
	public InvalidNameException() {
		// do nothing
	}

	public String toString(){
		return "InvalidNameException was raised. Ensure the following: name is not null, name is more less or equal to 30 characters, name has no white spaces, name is not null.";
	}

	/**
	 * Constructs an instance of the exception containing the message argument
	 * 
	 * @param message message containing details regarding the exception cause
	 */
	public InvalidNameException(String message) {
		super(message);
	}

}
