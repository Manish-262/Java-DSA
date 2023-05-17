public class Update_ith_Bit{
    public static int ClearBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static int SetBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int UpdateBit(int n,int i,int newBit){
        /*if(newBit==0){
            return ClearBit(n,i);
        }
        else{
            return SetBit(n,i);
        } */
        n = ClearBit(n,i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }
    public static void main(String args[]){
        System.out.println(UpdateBit(10,2,1));
    }
}