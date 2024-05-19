package test07;

public class NameFormatExecption extends RuntimeException {
    public NameFormatExecption() {
    }

    public NameFormatExecption(String message) {
        super(message);
    }

    public NameFormatExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public NameFormatExecption(Throwable cause) {
        super(cause);
    }

    public NameFormatExecption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
