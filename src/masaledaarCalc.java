import java.util.Scanner;

class invalidInputException extends Exception{
    @Override
    public String getMessage() {
        return "Invalid input entered";
    }
    @Override
    public String toString(){
        return "Invalid input entered";
    }
}

class divideByZeroException extends Exception{
    @Override
    public String getMessage() {
        return "cannot divide by zero";
    }
    @Override
    public String toString(){
        return "cannot divide by zero";
    }
}

class maxInputException extends Exception{
    @Override
    public String getMessage() {
        return "Input entered is greater than allowed";
    }
    @Override
    public String toString(){
        return "Input entered is greater than allowed";
    }
}

class maxMultiplierException extends Exception{
    @Override
    public String getMessage() {
        return "Invalid input entered";
    }
    @Override
    public String toString(){
        return "Invalid input entered";
    }
}

public class masaledaarCalc {
    public static void main(String[] args) throws invalidInputException, maxInputException, maxMultiplierException {
        /* Create a custom calc which shows the following exceptions and operatons
        1. + -> Add
        2. - -> Sub
        3. * -> Multi
        4. / -> Divide
        Exceptions
        1. Invalid input exception ex. 8 & 9
        2. Cannot divide by 0 exception
        3. Max Input Exception if any of the inputs is greater than 10**5
        4. Max multiplier reached exception Cannot ,utiply by any number grreater than 700

        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input for eg. -> \" 9 + 1\"");
        String inp = sc.nextLine();

        String[] wordsArray = inp.split(" ");

        if (wordsArray.length !=3){
            throw new invalidInputException();
        }
        try {
            int a = Integer.parseInt(wordsArray[0]), b = Integer.parseInt(wordsArray[2]);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        switch (wordsArray[1]){
            case "+":
                if ( a < 100000 && b < 100000){
                    System.out.println(a + " + " + b + " = " + (a+b) );
                }
                else throw new maxInputException();

            case "-":

                if ( a < 100000 && b < 100000){
                    System.out.println(a + " - " + b + " = " + (a-b) );
                }
                else throw new maxInputException();

            case "*":

                if ( a < 7000 && b < 7000){
                    System.out.println(a + " x " + b + " = " + (a*b) );
                }
                else throw new maxMultiplierException();


            case "/":
                if (b == 0){
                    throw new divideByZeroException();
                }
                if ( a < 100000 && b < 100000){
                    System.out.println(a + " x " + b + " = " + (a*b) );
                }
                else throw new maxInputException();

        }
    }
}
