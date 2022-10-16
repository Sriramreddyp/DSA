import java.util.Random;

public class QuickSort {

 public static void quickSort(int[] array) {
  quickSort(array, 0, array.length - 1);
 }

 public static void quickSort(int[] array, int lowIndex, int HighIndex) {

  if (lowIndex >= HighIndex) {
   return;
  }

  int pivotIndex = new Random().nextInt(HighIndex - lowIndex) + lowIndex;
  int pivot = array[pivotIndex];
  swap(array, pivotIndex, HighIndex);
  int leftPointer = lowIndex;
  int rightPointer = HighIndex;

  while (leftPointer < rightPointer) {
   while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
    leftPointer++;
   }
   while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
    rightPointer--;
   }
   swap(array, leftPointer, rightPointer);
  }
  swap(array, leftPointer, HighIndex);

  quickSort(array, lowIndex, leftPointer - 1);
  quickSort(array, leftPointer + 1, HighIndex);

 }

 private static void swap(int array[], int index1, int index2) {
  int temp = array[index1];
  array[index1] = array[index2];
  array[index2] = temp;
 }

 public static void main(String[] args){

  int arr[] = new int[]{90,75,100,64,4};

  System.out.println("...............Quick Sort.............");
  System.out.println();
  System.out.println("..............Before Sort...............");

  for(int i = 0;i<arr.length;i++){
   System.out.print(arr[i] + " ");
  }
  System.out.println();
  System.out.println(".............After Sort..............");

  quickSort(arr);

  for(int i = 0;i<arr.length;i++){
   System.out.print(arr[i] + " ");
  }

 }

}
