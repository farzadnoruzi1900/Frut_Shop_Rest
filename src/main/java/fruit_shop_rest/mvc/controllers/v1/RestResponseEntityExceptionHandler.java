package fruit_shop_rest.mvc.controllers.v1;

import fruit_shop_rest.mvc.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> notFoundExceptionHandler(Exception exception, WebRequest webRequest){
        return new ResponseEntity<Object>("no resource found",new HttpHeaders(), HttpStatus.NOT_FOUND);
    }
}
