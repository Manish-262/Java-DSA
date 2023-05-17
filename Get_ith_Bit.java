public class Get_ith_Bit{
    public static void GetBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask) == 0){
            System.out.println("bit 0");
        }
        else{
            System.out.println("bit 1");
        }
    }
    public static void main(String args[]){
        GetBit(15,5);
    }
}