package RGMCode;

public class GuestNotFoundException extends Exception {
    public GuestNotFoundException(String s) {

    }

    public GuestNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
