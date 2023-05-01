public class InsertionSort{
    public static void sorting(int a[]){
        for(int i=1;i<a.length;i++){
            int curr=a[i];
            int prev=i-1;
            while(prev>=0 && a[prev]>curr){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }
    }
    public static void sort(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        int a[] = {1,29,5,3,90};
        sorting(a);
        sort(a);
    }
}