public class LinearSearch {
 void LinearSearch(int valueToBeSearched, int a[]) {
  for (int i = 0; i < a.length; i++) {
   if (a[i] == valueToBeSearched) {
    System.out.println("Value Found at index : " + i);
    return;
   }
  }
  System.out.println("Value Not Found");
 }
}