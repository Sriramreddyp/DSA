import java.util.Arrays;

public class MiddleFunction {

 static int[] middle(int[] arr) {
  if (arr.length == 1 || arr.length == 2) {
   return arr;
  }

  int[] ans = new int[arr.length - 2];
  int first = 0;
  int last = arr.length - 1;
  for (int i = 0; i < arr.length; i++) {
   if (i != first && i != last) {
    ans[i - 1] = arr[i];
   }
  }
  return ans;
 }

 public static void main(String[] args) {
  int[] Cutoff = { 1, 2, 3, 4, 5, 6, 7 };
  System.out.println(Arrays.toString(middle(Cutoff)));
 }

}
