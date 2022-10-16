public class Main {
 public static void main(String[] args) {
  Bubble bs = new Bubble();
  int arr[] = { 4, 5, 10, 2, 3 };
  // // bs.bubbleSort(arr);
  // // bs.printArray(arr);
  // Selection s = new Selection();
  // s.selectionSort(arr);
  // bs.printArray(arr);

  QuickSort qs = new QuickSort();
  qs.quickSort(arr);
  bs.printArray(arr);
 }
}