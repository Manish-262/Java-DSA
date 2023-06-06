public class Recursion_FibonacciSeries{
    public static int Fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        Fibonacci(n-1);
        Fibonacci(n-2);
        int res=Fibonacci(n-1) + Fibonacci(n-2);
        return res;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(Fibonacci(n));
    }
}