public class Factorial {

static int factorial(int n){
    if(n == 0 || n == 1){
        return n;
    }else
       return n * factorial(n-1);
}

    public static void main(String[] args) 
    {
var factorial = factorial(4);
System.out.println(factorial);
        
    }
}
