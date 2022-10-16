
public class TwoDimensionalArray {
 int arr[][] = null;

 public TwoDimensionalArray(int numberOfRows, int numberOfColoumns) {
  this.arr = new int[numberOfRows][numberOfColoumns];
  for (int i = 0; i < numberOfRows; i++) {
   for (int j = 0; j < numberOfColoumns; j++) {
    arr[i][j] = Integer.MIN_VALUE;
   }
  }
 }

 public void insert(int row, int col, int value) {
  try {
   if (arr[row][col] == Integer.MIN_VALUE) {
    arr[row][col] = value;
    System.out.println("Succesfully initialized");
   } else {
    System.out.println("Index Preoccupied");
   }
  } catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("Array is Full");
  }
 }

 public void AccessCell(int row, int col) {
  System.out.println("Acessing Row : " + row + "Acessing Coloumn :" + col);
  try {
   System.out.println("Element : " + arr[row][col]);
  } catch (ArrayIndexOutOfBoundsException exception) {
   System.out.println("Invalid Index");
  }
 }

 public void traverse() {
  for (int i = 0; i < arr.length; i++) {
   for (int j = 0; j < arr[0].length; j++) {
    System.out.print(arr[i][j] + ",");
   }
   System.out.println();
  }
 }

 public void Search(int valueToBeSearched) {
  for (int i = 0; i < arr.length; i++) {
   for (int j = 0; j < arr[0].length; j++) {
    if (arr[i][j] == valueToBeSearched) {
     System.out.println("Value Found at " + i + "Row " + j + " coloumns");
    } else {
     System.out.println("elemnts Not Found...");
    }
   }
  }
 }

 public void Delete(int row, int col) {
  try {
   if (arr[row][col] != Integer.MIN_VALUE) {
    arr[row][col] = Integer.MIN_VALUE;
    System.out.println("Sucessfully Deleted at row :" + row + ",coloumn" + col);
   }
  } catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("Invalid Index");
  }
 }

}
