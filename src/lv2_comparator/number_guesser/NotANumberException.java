package lv2_comparator.number_guesser;

public class NotANumberException extends Exception{

    public NotANumberException(String message) {
        super(message);
    }

    public NotANumberException(String message, Throwable cause) {
        super(message, cause);
    }

}
