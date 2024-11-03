package hkn7b.dev.appservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException exception, WebRequest request) {
        ErrorDetailResponse errorDetailResponse = new ErrorDetailResponse(new Date(),
                exception.getMessage(),
                request.getDescription(true));
        return new ResponseEntity<>(errorDetailResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ResourceBadRequestException.class)
    public ResponseEntity<?> resourceBadRequestException(ResourceBadRequestException exception, WebRequest request) {
        ErrorDetailResponse errorDetailResponse = new ErrorDetailResponse(new Date(),
                exception.getMessage(),
                request.getDescription(true));
        return new ResponseEntity<>(errorDetailResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AppServiceRuntimeException.class)
    public ResponseEntity<?> resourceNotFound(AppServiceRuntimeException exception, WebRequest request) {
        ErrorDetailResponse errorDetailResponse = new ErrorDetailResponse(new Date(),
                exception.getMessage(),
                request.getDescription(true));
        return new ResponseEntity<>(errorDetailResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
