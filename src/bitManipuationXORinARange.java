public class bitManipuationXORinARange {
    public static void main(String[] args) {
        System.out.println(XORinRange(1,2)); // Patern based question
    }
    static int XORhelper(int a){
        if (a % 4 == 0) return a;
        else if (a % 4 == 1) return 1;
        else if (a % 4 == 2) return a + 1;
        else return 0;
    }
    static int XORinRange(int a, int b){
        int leftXOR = XORhelper(a - 1);
        int fullXOR = XORhelper(b);
        return leftXOR ^ fullXOR;
    }
}
