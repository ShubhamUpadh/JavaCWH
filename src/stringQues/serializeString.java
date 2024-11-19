package stringQues;

public class serializeString {
    public static void main(String[] args) {
        String[] A = new String[]{"flipkart"};
        System.out.println(serialize(A));
        String k = " abc";
        System.out.println(k.length());

    }
    public static String serialize(String[] A){
        StringBuilder retStr = new StringBuilder();
        for (int i = 0; i < A.length; i++){
            retStr.append(A[i]).append(String.valueOf(A[i].length())).append("~");
        }
        return retStr.toString();
    }
}
