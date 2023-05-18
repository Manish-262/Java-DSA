public class Constructor{
    public static void main(String args[]){ 
        Student s1 = new Student("Ravi");
        System.out.println(s1.name);
    }
}
class Student{
    String name;
    Student(String name){
        //System.out.println("Constructor is called.....");
        this.name=name;
    }
}