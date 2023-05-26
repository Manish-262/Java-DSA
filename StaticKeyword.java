public class StaticKeyword{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.CollegeName="ApnaCollege";
        Student s2 = new Student();
        System.out.println(s2.CollegeName);
        Student s3 = new Student();
        s3.CollegeName="Abc";
        System.out.println(s2.CollegeName);
    }
}
class Student{
    static int Percentage(int phy,int chem,int maths){
        return (phy+chem+maths)/3;
    }
    String name;
    int roll;
    static String CollegeName;
    void set(String name){
        this.name=name;
    }
    String get(){
        return this.name;
    }
}