package array;

/**
 * @author kunal
 * two sum: finding the target value based on array provided,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 */
public class TwoSum {

    //O(n^2)
    public static int[] twoSum(int[] ar1,int target){
        int[] sumIndex = new int[2];

        for(int i = 0;i< ar1.length;i++){
            for(int j = i+1;j<ar1.length;j++){
                if(j< ar1.length && ar1[i]+ar1[j] == target){
                    sumIndex[0] = i;
                    sumIndex[1] = j;
                    break;
                }
            }
        }

        return sumIndex;
    }

    public static void main(String[] args) {

        int[] ar1 = {3,2,3};
        int target = 6;
        int indexes[]  = twoSum(ar1,target);

        for(int i = 0;i<indexes.length;i++){
            System.out.print(indexes[i]+",");
        }

    }
}
