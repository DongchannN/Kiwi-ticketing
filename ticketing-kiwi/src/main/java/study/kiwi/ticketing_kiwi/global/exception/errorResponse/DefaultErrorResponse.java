package study.kiwi.ticketing_kiwi.global.exception.errorResponse;

import lombok.Getter;

@Getter
public class DefaultErrorResponse {
    private final int code;
    private final String message;

    public DefaultErrorResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
