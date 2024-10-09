package exception;

public class NullReferenceException extends AdoptionException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2L;

    public NullReferenceException(String fieldName) {
        super("The field '" + fieldName + "' is null or missing.");
    }
}
