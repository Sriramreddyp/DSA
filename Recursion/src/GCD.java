public class GCD {
 static int gcd(int a, int b) {
  if (a < 0 || b < 0)
   return -1;
  if (b == 0)
   return a;
  else
   return gcd(b, a % b);
 }

 public static void main(String[] args) {
  var gcd = gcd(8, 4);
  System.out.println(gcd);
 }
}
