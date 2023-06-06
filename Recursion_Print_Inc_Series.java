public class Recursion_Print_Inc_Series{
    public static void PrintInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        PrintInc(n-1);
        System.out.println(n+" ");
    }
    public static void main(String args[]){
        int n;
        PrintInc(10);
    }
}