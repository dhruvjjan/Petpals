package exception;

public class InvalidPetAgeException extends AdoptionException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3L;

    public InvalidPetAgeException() {
        super("Pet age must be a positive integer.");
    }
}
