public class CopyConstructor{
    public static void main(String args[]){ 
        Student s1 = new Student();
        s1.name="Ravi";
        s1.roll=5;
        s1.password="dba";
        System.out.println(s1.name);
        System.out.println(s1.roll);
        s1.marks[0]=90;
        s1.marks[1]=95;
        s1.marks[2]=98;
        Student s2 = new Student(s1);
        s2.password="abc";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    //copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called.....");
    }
}