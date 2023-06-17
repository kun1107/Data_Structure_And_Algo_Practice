package array;

/*Count the maximum consecutive 1 in an array*/

public class MaximumconsecutiveoneArray {

    public static void maxCount(int[] arr) {
        int result = 0;
        int count = 0;
        for (int j : arr) {
            if (j == 0) {
                count = 0;
            } else {
                count++;//increase count
                result = Math.max(result, count);
            }
        }

        System.out.println("Maximum Element = "+result);


    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        maxCount(arr);
    }
}


