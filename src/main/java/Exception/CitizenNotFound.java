package Exception;

public class CitizenNotFound extends RuntimeException{
    public CitizenNotFound(String message){
        super(message);
    }
}
