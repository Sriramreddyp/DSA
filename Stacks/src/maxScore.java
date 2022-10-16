import java.util.Arrays;

public class maxScore{
   static int maxscore(int arr[],int partitionSize){

        if(arr.length == 0 || arr.length == 1 || arr.length <
                partitionSize || (arr.length % partitionSize != 0)){
            return 0;
        }
        //Sort the given array
        Arrays.sort(arr);
        int maxScore = 1;
        int i = 1;
        // for(int i = 0;i<arr.length;i++){
        //   int product = 1;
        //
        //
        //  }
       while(i <= arr.length){
            int product = 1;
            while(i % partitionSize != 0){
                product = arr[i-1]*product;
                i++;
            }
            if(product > maxScore){
                maxScore = product;
            }
            i++;
        }
        return maxScore;
   }
   public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5,6};
        System.out.println(maxscore(arr, 2));

    }
}