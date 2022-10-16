public class StackMinimum {
 public class StackMin {

  int[] arr;
  int top;
  int min = 0;

  public StackMin(int size) {
   this.arr = new int[size];
   this.top = -1;
  }

  public int min() {
   if (top == -1) {
    return -1;
   }
   return min;
  }

  public void push(int value) {
   if (top == arr.length - 1) {
    return;
   } else if (top == -1) {
    top++;
    arr[top] = value;
    min = value;
   } else {
    top++;
    arr[top] = value;
    if (value < min) {
     min = value;
    }
   }
  }

  public int pop() {
   if (top == -1) {
    return -1;
   } else {
    if (min == arr[top]) {
     int value = arr[top];
     min = arr[top - 1];
     arr[top] = 0;
     top--;
     return value;
    } else {
     int value = arr[top];
     arr[top] = 0;
     top--;

     return value;
    }
   }

  }
 }
}