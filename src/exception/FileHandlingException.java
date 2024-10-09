package exception;

import java.io.IOException;

public class FileHandlingException extends IOException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4L;

    public FileHandlingException(String message) {
        super(message);
    }
}
