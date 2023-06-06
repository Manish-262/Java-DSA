public class Recursion_first_occurence{
    public static int FirstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurence(arr,key, i+1);
        
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,15};
        int key=16;
        int i=0;
        System.out.println(FirstOccurence(arr, key, i));
    }
}