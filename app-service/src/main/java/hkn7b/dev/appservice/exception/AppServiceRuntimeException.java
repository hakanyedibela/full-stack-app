package hkn7b.dev.appservice.exception;

public class AppServiceRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public AppServiceRuntimeException(String message) {
        super(message);
    }

    public AppServiceRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
