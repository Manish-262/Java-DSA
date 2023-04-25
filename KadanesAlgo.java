import java.util.*;
public class Kadanes{
    public static void KadanesAlgo(int num[]){
        int MaxSum=Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<num.length;i++){
            if(currsum<0){
                currsum=0;
            }
            MaxSum = Math.max(currsum,MaxSum);
        }
        System.out.println("Max sum of subarray is : "+MaxSum);
    }
    public static void main(String args[]){
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        KadanesAlgo(num);
    }
}