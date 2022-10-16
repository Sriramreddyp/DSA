
// import java.util.Arrays;
import java.util.*;

public class Main {
 public static void main(String[] args) {
  // SingleDimensionArray sda = new SingleDimensionArray(10);

  // sda.insert(0, 10);
  // sda.insert(1, 20);
  // sda.Search(20);

  // sda.Delete(1);
  // sda.traverse();

  // TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
  // tda.insert(0, 0, 10);
  // tda.insert(0, 0, 10);

  // System.out.println(Arrays.deepToString(tda.arr));

  // tda.traverse();

  Scanner m = new Scanner(System.in);
  System.out.print("Enter  No of Days to be stored : ");
  int days = m.nextInt();

  ArrayProject temp = new ArrayProject(days);
  temp.addTemp();
  temp.AverageTemp();
  temp.checkTemp();
  m.close();

 }
}