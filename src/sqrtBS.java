public class sqrtBS {
    static int sol(double A){
        double low = 0, high = A;
        double mid = -1;
        int i = 0;
        while (low <= high){
            //int i = 0;
            mid = (int)( (low + high) /2);
            double midProd = mid * mid;
            if (midProd == A){
                return (int)mid;
            }
            else if (midProd < A){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
            System.out.println("Executing number " + ++i);
        }
        System.out.println("Here");
        return (int)(mid-1);
    }

    public static void main(String[] args) {
        System.out.println(sol(5));
    }
}
