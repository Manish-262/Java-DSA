public class Recursion_Print_Dec_Series{
    public static void PrintDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n+" ");
        PrintDec(n-1);
    }
    public static void main(String args[]){
        int n;
        PrintDec(10);
    }
}