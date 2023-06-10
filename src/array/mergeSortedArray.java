package array;

public class mergeSortedArray {

    /*assuming two arrays are sorted
    * need to merge two arrays
    * */

    public static int[] mergedArray(int[] ar1, int[] ar2){


        int ar1Length = ar1.length;
        int ar2Length = ar2.length;

        int[] mergedArray = new int[ar1Length+ar2Length];
        int i;
        for(i=0;i<ar1Length;i++) {
            mergedArray[i] = ar1[i];
        }
        int count = 0;
        for(int j=i;j<ar2Length+i;j++){
            mergedArray[j] = ar2[count];
            count++;
        }
        return mergedArray;
    }

    public static int[] mergeSortedArray(int [] mergedArray){


        int l = mergedArray.length;
        for(int i = l-1;i>=0;i--){
            for(int j = i-1;j>=0;j--){
                if(mergedArray[i]<mergedArray[j] && j>=0){
                    swap(i,j,mergedArray);
                }
            }
        }
        return mergedArray;
    }

    public static void swap(int a, int b, int[] ar){
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }

    //merge two sorted array
    public int[] merge2sortedArray(int[] ar1, int[] ar2){
        int[] mergedArray = new int[ar1.length+ar2.length];

        //compare two array
        int i = 0;
        int j = 0;
        int count = 0;
       while (ar1.length !=0 || ar2.length !=0){
           if(ar1[i]<ar2[j]){
               mergedArray[count] = ar1[i];
               i++;count++;
           }else{
               mergedArray[count] = ar1[j];
               j++;count++;
           }
       }



        return mergedArray;
    }

    public static void main(String[] args) {
         int[] ar1 = {0,3,4,31};
         int[] ar2 = {4,6,30};

         int[] mergedArray = mergedArray(ar1,ar2);

        System.out.println("Before sorting...");
         for(int i = 0;i<mergedArray.length;i++){
             System.out.print(mergedArray[i]+" ");
         }
        System.out.println();

        System.out.println("After Sorting...");

        int[] sortedArray = mergeSortedArray(mergedArray);

        for (int i = 0;i< sortedArray.length;i++){
            System.out.print(sortedArray[i]+" ");
        }

    }
}
