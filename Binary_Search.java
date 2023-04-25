import java.util.*;
public class Binary_Search{
    public static int BS(int num[],int key){
        int start=0,end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={1,2,3,10,20,30};
        int key = 10;
        System.out.println("Key is at index "+BS(num,key));
    }
}