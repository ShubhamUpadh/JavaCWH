import java.util.ArrayList;

public class collectionJava {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l2.add(15);
        l1.addAll(l2);
        for (Integer integer : l1) {
            System.out.println(integer);
        }
        System.out.println(l1);
    }
    static int[] toArray(ArrayList<Integer> al){
        int[] arr = new int[al.size()];
        for (int i = 0; i < al.size();i++){
            arr[i] = al.get(i);
        }
        return arr;
    }

    static ArrayList<Integer> setElement(ArrayList<Integer> al, int index, int element){
        int[] arr = new int[al.size()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (i == index) ? element : al.get(i);
        }
        ArrayList<Integer> retList = new ArrayList<>();
        for (int i : arr)   retList.add(i);
        return retList;
    }
}
