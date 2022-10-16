public class power {

 static int powerOfNumber(int n, int power) {

  if (power < 0 || n < 0) {
   return -1;
  }
  if (power == 0) {
   return 1;
  }
  if (n == 1) {
   return n;
  }
  if (power == 0) {
   return 1;
  } else {
   return n * powerOfNumber(n, power - 1);
  }
 }

 public static void main(String[] args) {

  var power = powerOfNumber(4, 3);
  System.out.println(power);

 }
}
