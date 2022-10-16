public class Binary {
 static int binary(int n) {
  if (n == 0)
   return 0;
  return n % 2 + 10 * binary(n / 2);
 }

 public static void main(String[] args) {
  var binary = binary(20);
  System.out.println(binary);
 }
}
