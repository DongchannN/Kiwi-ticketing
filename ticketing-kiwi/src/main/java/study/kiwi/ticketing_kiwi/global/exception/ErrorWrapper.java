package study.kiwi.ticketing_kiwi.global.exception;

import lombok.Getter;

@Getter
public class ErrorWrapper<T> {
    private final T error;

    public ErrorWrapper(T error) {
        this.error = error;
    }
}
