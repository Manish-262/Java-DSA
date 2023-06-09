public class TilingProblem{
    public static int TilingWays(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1=TilingWays(n-1);
        //horizontal choice
        int fnm2=TilingWays(n-2);
        int TotalWays=fnm1+fnm2;
        return TotalWays;
    }
    public static void main(String args[]){
        System.out.println(TilingWays(3));
    }
}