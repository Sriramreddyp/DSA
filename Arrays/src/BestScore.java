import java.util.Arrays;

public class BestScore {
 static String firstSecond(Integer[] myArray) {
  Integer[] arr = myArray;

  Arrays.sort(arr);
  return arr[arr.length - 1] + " " + arr[arr.length - 2];

 }

 public static void main(String[] args) {
  Integer[] arr = { 2, 5, 23, 7, 8, 9, 1 };
  System.out.println(firstSecond(arr));
 }
}
