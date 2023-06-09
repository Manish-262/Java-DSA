public class BinaryStrings{
    public static void BinString(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        // if(lastPlace==0){
        //     BinString(n-1, 0, str+"0");
        //     BinString(n-1, 1, str+"1");
        // }
        // else{
        //     BinString(n-1, 1, str+"1");
        // }
        BinString(n-1, 0, str+"0");
        if(lastPlace==0){
            BinString(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        BinString(3, 0,"");
    }
}