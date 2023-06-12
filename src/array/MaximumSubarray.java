package array;

/*
 * find the subarray with the largest sum, and return its sum.
 * */
public class MaximumSubarray {

    //O(n^2)
    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;

                }
            }

        }

        return max;
    }

    public static int maxSumFromSubrray(int[] ar) {
        int max_so_far = Integer.MIN_VALUE;
        int max_end_here = 0;

        for (int i = 0; i < ar.length; i++) {

            max_end_here = max_end_here + ar[i];

            if (max_so_far < max_end_here) {
                max_so_far = max_end_here;
            }
            if (max_end_here < 0) {
                max_end_here = 0;
            }

        }

        return max_so_far;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; //o/p:6
        /*int maxSum = maxSubArray(arr);
        System.out.println(maxSum);*/
        int i = maxSumFromSubrray(arr);
        System.out.println(i);

    }
}
