public class ConstructorOverloading{
    public static void main(String args[]){ 
        Student s1 = new Student("Ravi");
        System.out.println(s1.name);
        Student s2 = new Student();
        System.out.println(s2.roll);
        Student s3 = new Student("Ravi",5);
        System.out.println();
    }
}
class Student{
    String name;
    int roll;
    Student(String name){
        //System.out.println("Constructor is called.....");
        this.name=name;
    }
    Student(){
        roll=5;
    }
    Student (String name, int roll){
        this.name=name;
        this.roll=roll;
    }
}