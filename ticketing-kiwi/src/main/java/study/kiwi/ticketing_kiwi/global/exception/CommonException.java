package study.kiwi.ticketing_kiwi.global.exception;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CommonException extends RuntimeException {
    private CommonResponseStatus error;

    public CommonException(CommonResponseStatus error) {
        super(error.getMessage());
        this.error = error;
    }
}
