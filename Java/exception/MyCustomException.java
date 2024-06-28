package exception;

public class MyCustomException extends RuntimeException{
    private String mystring;

    public MyCustomException(String mystring) {
        this.mystring = mystring;
    }

    public String getMystring() {
        return mystring;
    }

    void displayMessage(){
        System.out.println("The String is found to be null." + '\n' + "Exception Thrown by the Custom Exception");
    }
}
