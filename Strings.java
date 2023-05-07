import java.util.*;
public class Strings{
    public static void printletters(String full_name){//we can also pass (String str)
        for(int i=0;i<full_name.length();i++){
            System.out.print(full_name.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str1 = new String("abcd");
        Scanner sc = new Scanner(System.in);
        String first_name="Tonny";
        String last_name="Stark";
        //first_name=sc.next(); for single word;
        //first_name=sc.nextLine(); for whole line
        //concatenation
        String full_name=first_name+" "+last_name;
        //System.out.println(full_name);
        //System.out.println(full_name.length());
        //System.out.println(full_name.charAt(0));
        printletters(full_name);
    }
}