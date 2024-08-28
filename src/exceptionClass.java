class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString() + "I am toString()";
    }
    @Override
    public String getMessage(){
        return " I am getMessage()";
    }
}

public class exceptionClass {
    public static void main(String[] args) {
        int a = 8;
        if (a> 5){
            try {
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e);
                e.printStackTrace();
            }
        }

    }
}
