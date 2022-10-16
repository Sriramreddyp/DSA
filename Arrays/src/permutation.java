public class permutation {
 static boolean Permutation(int arr1[], int[] arr2) {
  if (arr1.length != arr2.length) {
   throw new IllegalArgumentException("Sizes are not equal");
  }
  int sum1 = 0;
  int sum2 = 0;

  for (int i = 0; i < arr1.length; i++) {
   sum1 = sum1 + arr1[i];
   sum2 = sum2 + arr2[i];
  }
  if (sum1 == sum2) {
   return true;
  }
  return false;
 }

 public static void main(String[] args) {
  int[] arr1 = { 1, 2, 3, 4, 5 };
  int[] arr2 = { 2, 1, 4, 5, 3, 6 };

  System.out.println(Permutation(arr1, arr2));
 }
}
