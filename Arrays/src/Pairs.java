public class Pairs {
 public static String pairSum(int[] myArray, int sum) {
  String result = "";
  for (int i = 0; i < myArray.length; i++) {
   for (int j = i + 1; j < myArray.length; j++) {
    if ((myArray[i] + myArray[j]) == sum)
     result = result + myArray[i] + ":" + myArray[j] + " ";
   }
  }
  return result;
 }
}
