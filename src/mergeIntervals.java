public class mergeIntervals {
    public static void main(String[] args) {

    }
    static int[][] solution(int[][] arr, int[] interval){
        int[] numberLine = new int[arr[arr.length-1][1] + 1];
        for (int[] intArr : arr) {
            numberLine[intArr[0]] = 1;
            numberLine[intArr[1]] = -1;
        }
        boolean intervalStart = false, mergeIntervalStart = false;
        int i = 0;
        while (i < numberLine.length){
            if (numberLine[i] == 1)
                intervalStart = true;

            else if (numberLine[i] == -1)
                intervalStart = false;

            if (i == interval[0]){
                if (!intervalStart) numberLine[i] = 1;
                mergeIntervalStart = true;
                while (i < numberLine.length && i < interval[1]){
                    if (numberLine[i] != 0){
                        numberLine[i] = 0;
                    }
                    i++;
                }
                if (numberLine[i] == 1) numberLine[i] = 0;
                else numberLine[i] = -1;
            }
            i++;
        }
        return new int[][]{{1,1},{1,1}};
    }
}
