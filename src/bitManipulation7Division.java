public class bitManipulation7Division {
    public static void main(String[] args) {
        System.out.println(sol(-2147483648,-10000000));
    }
    static int sol(int A, int B){
        System.out.println("Here123");
        if (B == 0) return 12;
        if (B == Integer.MAX_VALUE || B == Integer.MIN_VALUE){
            System.out.println("This case");
            return 0;
        }

        long dividend = (Math.abs(A) != A) ? Math.abs(A) : (long)Integer.MAX_VALUE + 1;
        long divisor = Math.abs(B);
        int ans = 0;

        while (dividend > divisor){
            int shift = 0;
            long temp = divisor;

            while (dividend >= temp){
                temp = temp << 1;
                shift++;
            }
            System.out.println("Here");

            dividend -= divisor<<(shift - 1);
            ans += 1<<(shift-1);
        }
        boolean negative = true;
        if (((A < 0) && (B < 0)) || ((A > 0) && (B > 0))) negative = false;
        return negative ? ans *- 1 : ans;
    }
}
