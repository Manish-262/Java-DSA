import java.util.*;
public class InbuiltSorting{
    public static void sorting(Integer a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        Integer a[] = {1,399,5,45};
        Arrays.sort(a);
        //Arrays.sort(a,0,3);
        //Arrays.sort(a,Collections.reverseOrder());
        //Arrays.sort(a,0,3,Collections.reverseOrder());
        sorting(a);
    }
}