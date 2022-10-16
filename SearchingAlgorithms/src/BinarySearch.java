public class BinarySearch {
 int BinarySearch(int a[], int valueToBeSearched, int lowindex, int highindex) {

  if (a.length < 2) {
   return lowindex;
  }

  int leftPointer = lowindex;
  int rightPointer = highindex;

  int middleIndex = (leftPointer + rightPointer) / 2;

  while (a[middleIndex] != valueToBeSearched) {
   if (a[middleIndex] > valueToBeSearched) {
    BinarySearch(a, valueToBeSearched, middleIndex, rightPointer);
   } else {
    BinarySearch(a, valueToBeSearched, leftPointer, middleIndex);
   }
  }
  if (a[middleIndex] == valueToBeSearched) {
   return middleIndex;
  } else {
   return -1;
  }

 }
}
