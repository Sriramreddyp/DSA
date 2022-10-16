public class practiceBubble {

 void bubbleSort(int a[]) {
  for (int i = 0; i < a.length; i++) {
   for (int j = 0; j < a.length - i - 1; i++) {
    if (a[j] > a[j + 1]) {
     int temp = a[j];
     a[j] = a[j + 1];
     a[j + 1] = temp;
    }
   }
  }
 }

 void selectionSort(int a[]) {
  for (int i = 0; i < a.length; i++) {
   int minimumindex = i;
   for (int j = i; i < a.length; i++) {
    if (a[j] < a[minimumindex]) {
     minimumindex = j;
    }
   }

   if (minimumindex != i) {
    int temp = a[i];
    a[i] = a[minimumindex];
    a[minimumindex] = temp;
   }
  }
 }

}
