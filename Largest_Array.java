import java.util.*;
public class Largest_Array{
    public static int getlargest(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=1;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int num[]={1,2,6,3,5};
        System.out.println("Largest number is "+getlargest(num));
    }
}