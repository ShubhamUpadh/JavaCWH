public class arrays2 {
    public static void main(String[] args) {
        int [][] multiArr = new int[10][10];

//        float [] arr = {100,12.0434f,33f,5.67f,54.909f,56.09f};

//        float sum = 0f;
//
//        for (float val : arr){
//            sum += val;
//
//        }
//        int n = 100;
//
//        for (float val:arr){
//            if (n == val){
//                System.out.println("Pre");
//            }
//        }
////
//        int [] array = {1,2,3,4,5,6,7};
//
//        for (int i =0; i< array.length/2; i++){
//            int temp = array[i];
//            array[i] = array[array.length-i-1];
//            array[array.length-i-1] = temp;
//        }
//
//        for (int k : array){
//            System.out.print(k + " \t");
//        }
        int [] arr = {10,20,45,30};

        int max = arr[0];
        int min = arr[1];

        for (int val:arr){
            if (max < val){
                max = val;
            }
            if (min > val){
                min = val;
            }
        }
        System.out.println(max);
        System.out.println(min);

        boolean isSorted = true;

        for (int i = 0; i< arr.length-1;i++){
            if (arr[i] >= arr[i+1]){
                    isSorted = false;
                    break;
            }
        }

        if (isSorted){
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not Sorted");
        }
    }

}

