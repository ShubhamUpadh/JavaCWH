public class powerFunctionModuloBinary {
    static void solution(int x, int n, int d){
        System.out.println("Nothing");
    }
    static int pow(int x, int n, int d) {
        if (x == 0) return 0;  // x^0 is 1
        if (n == 0) return 1;  // 0^n is 0 for any n

        long result;

        if (n % 2 == 0) {
            // Even power: x^n = (x^(n/2))^2
            result = pow(x, n / 2, d);
            result = (result * result) % d;  // Ensure the result is taken modulo d
        } else {
            // Odd power: x^n = x * x^(n-1)
            result = pow(x, n - 1, d);
            result = (result * x) % d;  // Multiply x and take modulo d
        }

        // Ensure the result is non-negative (Java's % can return negative numbers)
        return (int) ((result + d) % d);
    }

    public static void main(String[] args) {
        System.out.println(pow(2,3,3));
    }
}
