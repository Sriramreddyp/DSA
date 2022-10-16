import java.util.Arrays;

public class Mycode2D {
 int n;
 int m;
 int[][] Matrix;
 int rowCount = 0;
 int colCount = 0;

 public Mycode2D(int n, int m) {
  this.m = m;
  this.n = n;
  Matrix = new int[n][m];
 }

 void insert(int valueToBeInserted) {
  while (rowCount < n) {
   while (colCount < m) {

    Matrix[rowCount][colCount] = valueToBeInserted;
    colCount++;
    break;
   }
   if (colCount == m) {
    colCount = 0;
    rowCount++;
   }
   break;
  }
 }

 public static void main(String[] args) {
  Mycode2D mc = new Mycode2D(2, 2);
  mc.insert(3);
  mc.insert(4);
  mc.insert(5);
  mc.insert(6);
  mc.insert(7);
  mc.insert(8);
  mc.insert(9);
  mc.insert(10);
  mc.insert(11);
  mc.insert(12);

  System.out.println(Arrays.deepToString(mc.Matrix));
 }

}
