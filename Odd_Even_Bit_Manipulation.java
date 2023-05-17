public class Odd_Even_Bit_Manipulation{
    public static void Odd_Even(int n){
        int bitMask=1;
        if((n & bitMask) == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[]){
        Odd_Even(3);
        Odd_Even(4);
    }
}