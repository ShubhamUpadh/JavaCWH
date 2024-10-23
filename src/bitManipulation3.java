public class bitManipulation3 {
    public static void main(String[] args) {
        System.out.println(minFlips(10,7));
    }
    static int minFlips(int A, int B){
        int temp = A ^ B;
        int counter = 0;
        while (temp > 0){
            temp = temp & (temp -1);
            counter++;
        }
        return counter;
    }
}
