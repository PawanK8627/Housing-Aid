package Exception;

public class HousingApplicationNotFound extends RuntimeException {
    public HousingApplicationNotFound(String message) {
        super(message);
    }
}
