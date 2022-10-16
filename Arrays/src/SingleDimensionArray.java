public class SingleDimensionArray {

 int arr[] = null;

 public SingleDimensionArray(int sizeOfArray) {
  arr = new int[sizeOfArray];
  for (int i = 0; i < arr.length; i++) {
   arr[i] = Integer.MIN_VALUE;
  }
 }

 // Insertion

 public void insert(int location, int valueToBeInserted) {
  try {
   if (arr[location] == Integer.MIN_VALUE) {
    arr[location] = valueToBeInserted;
    System.out.println("sucessfully Inserted");
   } else {
    System.out.println("Cell already Ocuppied");
   }
  } catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("Invalid index to access array");
  }
 }

 // Array Traverse

 public void traverse() {
  try {
   for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
   }
  } catch (Exception e) {
   System.out.println("Array No longer exists");
  }
 }

 // Search in Array

 public void Search(int ValueToSearch) {
  for (int i = 0; i < arr.length; i++) {
   if (arr[i] == ValueToSearch) {
    System.out.println("Index of the Element : " + i);
    return;
   } else {
    System.out.print("Element not available in the array");
   }
  }
 }

 public void Delete(int valueToBeDeleted) {
  try {

   if (arr[valueToBeDeleted] != Integer.MIN_VALUE) {
    arr[valueToBeDeleted] = Integer.MIN_VALUE;
    System.out.println("Sucessfully Deleted");
   }
  } catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("Array Dosent Exists");
  }

 }

}
