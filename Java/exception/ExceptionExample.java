package exception;

public class ExceptionExample {
    public static void main(String[] args) throws MyCustomException{
        int[] exampleArray = new int[10];

        int cntr = 0;

        for(int i = 1; i < exampleArray.length ; i++){
            exampleArray[i] = i;
        }

        // one single catch block
        try{
            System.out.println(exampleArray[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println('\n' + "Index Out of Bound Exception occured" + '\n');
        }finally {
            System.out.println("Finally block executed for the Index Out of Bound Exception case" + '\n');
        }

        //Multiple catch blocks implementation
        try{
            String nullstring = null;
            nullstring.length();

            int example = 0;
            example/=0;

        }catch (ArithmeticException e){
            System.out.println(e.getMessage() + ": This uses single line catch block" + '\n');
        } catch (NullPointerException e){
            System.out.println(e.getMessage() + ": This uses single line catch block" + '\n');
        }

        System.out.println("That is the code after try-catch blocks" + '\n');

        //Using one line to catch exception instead of several blocks
        try{
            String nullstring = null;
            nullstring.length();

            int example = 0;
            example/=0;

        }catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage() + ": This uses single line catch block" + '\n');
        }

        //Executing my custom exception that is thrown by me
        try {
            String nullstring = null;
            if (nullstring == null) {
                throw new MyCustomException(nullstring);
            }
        } catch (MyCustomException e) {
            e.displayMessage();
        }
    }
}
