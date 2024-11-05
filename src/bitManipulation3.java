public class bitManipulation3 {
    public static void main(String[] args) {
        System.out.println(minFlips(4,7));
    }
    static int minFlips(int A, int B){
        int temp = A ^ B;       // 7 ^ 4 = 111 ^ 100 = 011
        int counter = 0;
        while (temp > 0){
            temp = temp & (temp -1); // temp = (011)&(010) = (010), (010)^(001) = 0
            System.out.println(temp);
            counter++;
        }
        return counter;
    }
}
