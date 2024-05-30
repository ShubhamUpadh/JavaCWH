public class arrays {
    public static void main(String[] args) {
        int [] marks = new int [5];
        for (int j =0;j<marks.length;j++){
            marks[j] = 100 - 27*j + j*j;
        }
        for (int mark : marks) {
            System.out.println(mark);
        }

        int [] ide = {1,2,3};
        for (int i : ide){
            System.out.println(i);
        }
    }
}
