import java.util.Arrays;

public class MyCode {
 int n = 5;
 int[] arr = new int[n];
 int count = 0;

 void insert(int num) {

  while (count < n) {
   arr[count] = num;
   count++;
   break;
  }
 }

 void delete() {
  --count;
  arr[count] = 0;

 }

 public static void main(String[] args) {

  MyCode i = new MyCode();

  i.insert(5);
  i.insert(6);
  i.delete();
  i.insert(6);
  System.out.println(Arrays.toString(i.arr));

 }
}
