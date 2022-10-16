public class SirBinarySearch {
 int BinarySearch(int a[], int valueToBeSearched) {

  int leftPointer = 0;
  int rightPointer = a.length - 1;

  int middleIndex = (leftPointer + rightPointer) / 2;

  while (a[middleIndex] != valueToBeSearched && leftPointer <= rightPointer) {
   if (a[middleIndex] > valueToBeSearched) {
    rightPointer = middleIndex - 1;
   } else {
    leftPointer = middleIndex + 1;
   }
   middleIndex = (leftPointer + rightPointer) / 2;
  }

  if (a[middleIndex] == valueToBeSearched) {
   return middleIndex;
  } else {
   return -1;
  }

 }
}
