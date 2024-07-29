public class makeElementsEqual {
    static int solution(int[] A){
        for (int a : A){
            if (a == A[0] || a == A[0]-B || a == A[0]+B){
                continue;
            }
            else return 0;
        }
        return 1;
    }
}
