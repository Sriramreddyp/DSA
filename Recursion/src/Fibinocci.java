import java.util.*;

public class Fibinocci {
 static int fibinocci(int n) {
  if (n < 0) {
   return -1;
  }
  if (n == 0 || n == 1) {
   return n;
  } else
   return fibinocci(n - 1) + fibinocci(n - 2);

 }

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the Number of Fibonicco sequence to be Printed : ");
  int sequence = scan.nextInt();
  System.out.println();

  for (int i = 0; i < sequence; i++) {
   System.out.println(fibinocci(i));
  }
  scan.close();
 }
}
