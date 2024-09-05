package study.kiwi.ticketing_kiwi.global.exception.exceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import study.kiwi.ticketing_kiwi.global.exception.CommonException;
import study.kiwi.ticketing_kiwi.global.exception.ErrorWrapper;
import study.kiwi.ticketing_kiwi.global.exception.errorResponse.DefaultErrorResponse;

@RestControllerAdvice("study.kiwi.ticketing_kiwi.domain")
public class DefaultExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorWrapper<DefaultErrorResponse>> commonExHandle(CommonException e) {
        DefaultErrorResponse errorReport = new DefaultErrorResponse(e.getError().getCode(), e.getMessage());
        ErrorWrapper<DefaultErrorResponse> error = new ErrorWrapper<>(errorReport);
        return new ResponseEntity<>(error, e.getError().getStatusCode());
    }
}
