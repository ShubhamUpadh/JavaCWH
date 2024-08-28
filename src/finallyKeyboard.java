public class finallyKeyboard {
    public static void main(String[] args) {
        sol();
//        try{
//            int a = 5, b = 0;
//            System.out.println(a/b);
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("End of this program");
//        }
    }
    public static int sol(){
        try{
            for (int i = 0; i < 10; i++){
                System.out.println(i);
                if (i > 5){
                    break;
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Cleaning up the resources, bye");
            return 10;
        }
    }
}
