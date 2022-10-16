public class Selection {
 static void selectionSort(int[] a) {
  for (int j = 0; j < a.length; j++) {
   int minimumindex = j;
   for (int i = j + 1; i < a.length; i++) {
    if (a[i] < a[minimumindex]) {
     minimumindex = i;
    }
   }
   if (minimumindex != j) {
    int temp = a[j];
    a[j] = a[minimumindex];
    a[minimumindex] = temp;
   }
  }
 }
}
