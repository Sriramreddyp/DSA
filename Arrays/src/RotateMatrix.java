import java.util.Arrays;

public class RotateMatrix {
 static boolean rotateMatrix(int[][] matrix) {

  if (matrix.length != matrix[0].length)
   return false;
  int n = matrix.length;

  for (int layer = 0; layer < n / 2; layer++) {
   int first = layer;
   int last = n - 1 - layer;
   for (int j = first; j < last; j++) {
    int offset = j - first;
    int top = matrix[first][j];
    matrix[first][j] = matrix[last - offset][first];
    matrix[last - offset][first] = matrix[last][last - offset];
    matrix[last][last - offset] = matrix[j][last];
    matrix[j][last] = top;
   }

  }
  return true;
 }

 public static void main(String[] args) {
  int[][] arr = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
  System.out.println(rotateMatrix(arr));
  System.out.println(Arrays.deepToString(arr));
 }
}
