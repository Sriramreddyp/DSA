public class Main {
 public static void main(String[] args) {
  int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
  // LinearSearch ls = new LinearSearch();
  // ls.LinearSearch(4, arr);
  SirBinarySearch bs = new SirBinarySearch();
  System.out.println(bs.BinarySearch(arr, 6));
 }
}