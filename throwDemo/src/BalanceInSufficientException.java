public class BalanceInSufficientException extends Exception{
    String message;
    public BalanceInSufficientException(String message){
        this.message=message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}

