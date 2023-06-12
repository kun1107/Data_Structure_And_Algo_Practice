package array;

import java.util.HashMap;
import java.util.Map;

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
    //o(n)
    public static int[] twoSumWithHashmap(int[] ar1,int target){
        int sumIndex[] = new int[2];
        Map<Integer,Integer> complementIndexMap = new HashMap<>();

        for(int i = 0;i< ar1.length;i++){
            int complement = target - ar1[i];
            if(complementIndexMap.containsKey(complement)){
                sumIndex[0] = i;
                sumIndex[1] = complementIndexMap.get(complement);
            }else{
                complementIndexMap.put(ar1[i],i);
            }
        }

        return sumIndex;
    }

    public static void main(String[] args) {

        int[] ar1 = {3,2,0,-1,6,7};
        int target = 5;
       /* int indexes[]  = twoSum(ar1,target);

        for(int i = 0;i<indexes.length;i++){
            System.out.print(indexes[i]+",");
        }*/

        int sumIndexes[] = twoSumWithHashmap(ar1,target);

        for(int i = 0;i<sumIndexes.length;i++){
            System.out.print((sumIndexes[i]+","));
        }

    }
}
