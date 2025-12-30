package taskExceptions.inputValidation;

public class AgeNegateiveException extends Exception{
    String message;
    public AgeNegateiveException(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
