import java.util.*;
public class Reverse_Array{
    public static void Reverse(int num[]){
        int first=0,last=num.length-1;
        while(first<last){
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int num[]={2,4,6,8};
        Reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}