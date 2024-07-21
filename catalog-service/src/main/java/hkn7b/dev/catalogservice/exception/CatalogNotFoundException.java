package hkn7b.dev.catalogservice.exception;

public class CatalogNotFoundException extends RuntimeException {

    public CatalogNotFoundException() {
        super();
    }

    public CatalogNotFoundException(String message) {
        super(message);
    }

    public CatalogNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
