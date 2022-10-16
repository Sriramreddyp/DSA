public class InsertionSort {
 static void insertionSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
   int temp = arr[i];
   int j = i;
   while (j > 0 && arr[j - 1] > temp) {
    arr[j] = arr[j - 1];
    j--;
   }
   arr[j] = temp;
  }
 }

 public static void main(String[] args){
  int arr[] = new int[]{90,75,100,64,4};
  insertionSort(arr);


 }

}
