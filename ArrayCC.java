import java.util.*;
public class ArrayCC{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Physics : "+marks[0]);
        System.out.println("Chemistry : "+marks[1]);
        System.out.println("Maths : "+marks[2]);
        //update maths marks
        //marks[2]=100;
       //System.out.println("Maths : "+marks[2]);
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage : " + percentage+"%");
        System.out.println("Length of array : "+marks.length);
    }
}