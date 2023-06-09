public class Recursion_PowerOptimization{
    public static int power_optimization(int x, int n){
        if(n==0){
            return 1;
        }
        //even power
        //int halfpowsq=power_optimization(x,n/2)*power_optimization(x,n/2);
        int halfpow=power_optimization(x,n/2);
        int halfpowsq=halfpow*halfpow;
        //odd power
        if(n%2!=0){
            halfpowsq=x*halfpowsq;
        }
        return halfpowsq;
    }
    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.println(power_optimization(x, n));
    }
}