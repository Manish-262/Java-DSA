public class ClearLast_ith_Bit{
    public static int ClearBit(int n,int i){
        int bitMask=(-1)<<i;
        //int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(ClearBit(15,2));
    }
}