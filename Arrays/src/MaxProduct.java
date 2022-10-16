public class MaxProduct {

 static String maxProduct(int[] intArray) {

  int max = 0;
  int maxProduct = 1;
  int num = 0;

  for (int i = 0; i < intArray.length; i++) {
   if (intArray[i] < 0)
    throw new IllegalArgumentException("Only Positive Numbers are allowed in the array");
   if (intArray[i] > max) {
    max = intArray[i];
   }
  }
  for (int i = 0; i < intArray.length; i++) {
   if (intArray[i] == max) {
    continue;
   }
   if ((max * intArray[i]) > maxProduct) {
    maxProduct = (max * intArray[i]);
    num = intArray[i];

   }
  }
  return "(" + num + "," + max + ")";
 }

 public static void main(String[] args) {
  int[] product = { 10, 20, 70, 40, 50, 70 };
  System.out.println(maxProduct(product));
 }

}
