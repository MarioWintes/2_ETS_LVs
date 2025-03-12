package lv3_fileIO.exceptions.ue.transporter;

public class TransporterMalfunctionException extends Exception {

    // nur message
    public TransporterMalfunctionException(String message) {
        super(message);
    }

    // message + Grund
    public TransporterMalfunctionException(String message, Throwable cause) {
        super(message, cause);
    }

    // custom: message + status
    // status wäre noch zu implementieren
    public TransporterMalfunctionException(String message, int status) {

    }
}
