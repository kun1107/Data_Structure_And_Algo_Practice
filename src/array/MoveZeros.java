package array;

public class MoveZeros {

    public static int[] moveZeros(int[] ar){

        int count = 0;

        for(int i = 0;i<ar.length;i++){
            if(ar[i]!=0){
                ar[count++] = ar[i];

            }
        }
        for(int j = count;j< ar.length;j++){
            ar[j] = 0;
        }

        return ar;
    }

    /*optimal as the number of swaps are less
    * and extra for loops for adding zero is avoided
    *  */
    public static void moveZerosOptimal(int[] ar){

        for(int lastZeroFoundAt = 0, cur = 0; cur<ar.length; cur++){
            if(ar[cur] !=0){
                swap(lastZeroFoundAt++,cur,ar);
            }
        }

        for(int i = 0;i<ar.length;i++) {
            System.out.print(ar[i]+" ");
        }
    }

    public static void swap(int a, int b, int[] ar){

        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;

    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,12,3};
       /* nums = moveZeros(nums);

        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }*/
        moveZerosOptimal(nums);

    }
}
