public class friends_pairing{
    public static int PairingWays(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        // int fnm1=PairingWays(n-1);
        // //pairs
        // int fnm2=PairingWays(n-2);
        // int pairways=(n-1)*fnm2;
        // int total_pairs = fnm1+pairways;
        // return total_pairs;
        return PairingWays(n-1) + (n-1)*PairingWays(n-2);

    }
    public static void main(String args[]){
        System.out.println(PairingWays(3));
    }
}