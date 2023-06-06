public class Recursion_SumOfNaturalNumbers{
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        Sum(n-1);
        int res=n+Sum(n-1);
        return res;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(Sum(n));
    }
}