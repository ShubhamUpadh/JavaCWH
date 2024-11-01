public class bitManipulation6ReverseBitRepresentation {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(sol(32));
    }

    static int sol(int A) {
        int i = 0;
        int ans = 0;
        while (A > 0) {
            System.out.println(i + " " + A);
            if (A % 2 != 0){

                ans = ans | (1 << (31 - i));
            }
            A = A >>1;
            i++;

        }
        return ans;
    }
}