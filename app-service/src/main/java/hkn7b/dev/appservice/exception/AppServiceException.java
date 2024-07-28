package hkn7b.dev.appservice.exception;

public class AppServiceException extends RuntimeException {

    public AppServiceException() {
        super();
    }

    public AppServiceException(String msg) {
        super(msg);
    }

    public AppServiceException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
