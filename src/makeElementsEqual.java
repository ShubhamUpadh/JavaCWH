public class makeElementsEqual {
    public static void main(String[] args) {
        int[] A =  { 3, 1, 2, 1, 3, 1, 2, 2, 1, 1, 2, 3, 3, 1, 3, 3, 3, 2, 3, 3, 1, 1, 1, 3, 3, 1, 3, 1, 3, 3, 1, 1, 3, 2, 2, 3, 1, 2, 1, 3, 3, 3, 2, 1, 1, 2, 1 };
        System.out.println(solution(A, 1));

    }

    static boolean isPresent(int val,int[] values){
        if (val == values[0] || val == values[1] || val == values[2]){
            return true;
        }
        return false;
    }
    static int solution(int[] A,int B){
        int[] values = {A[0], A[0]-B, A[0]+B};

        for (int i = 1; i < A.length; i++){
            if (isPresent(A[i],values) || isPresent(A[i] + B, values) || isPresent(A[i]-B, values)){
                continue;
            }
            else return 0;
        }
        return 1;
    }
}
