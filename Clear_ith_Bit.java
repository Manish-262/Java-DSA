public class Clear_ith_Bit{
    public static int ClearBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static void main(String args[]){
        System.out.println(ClearBit(10,1));
    }
}