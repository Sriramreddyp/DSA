public class sumOfDigits {
 static int sum(int n) {

  if (n == 0 || n < 0)
   return 0;
  else
   return (n % 10 + sum(n / 10));
 }

 public static void main(String[] args) {
  var sum = sum(2);
  System.out.println(sum);
 }
}