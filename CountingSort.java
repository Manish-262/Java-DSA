public class CountingSort{
    public static void CountSort(int a[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(largest,a[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void sorting(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        int a[] = {1,3,4,2,5};
        CountSort(a);
        sorting(a);
    }
} 