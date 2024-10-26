import java.util.ArrayList;

public class bitManipulation5PowerSet {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(powerSet(arr));
    }
    static ArrayList<ArrayList<Integer>> powerSet(int[] arr){
        int numOfSubsets = 1<< arr.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numOfSubsets; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for (int num = 0; num < arr.length; num++){
                if ((i & (1<<num)) == 0){
                    temp.add(arr[num]);
                    System.out.println("Added " + arr[num]);
                }
            }
            System.out.println("Added " + temp);
            res.add(temp);
        }
        return res;
    }
}
