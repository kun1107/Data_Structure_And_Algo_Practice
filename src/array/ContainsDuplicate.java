package array;

import java.util.HashSet;
import java.util.Set;

/*Given an integer array nums, return
 *true if any value appears at least twice in the array,
 * and return false if every element is distinct.*/
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> intSet = new HashSet<>();

        for (int num : nums) {

            if (intSet.contains(num)) {
                return true;
            }
            intSet.add(num);
        }
        System.gc();

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2};

        boolean bol = containsDuplicate(nums);
        System.out.println(bol);

    }

}
