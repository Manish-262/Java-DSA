public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen();
        //p1.setColor("Blue");
        //p1.color="Red";
        p1.setColor();
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        Student s1 = new Student();
        s1.name="Ravi";
        System.out.println(s1.name);
        System.out.println("age="+s1.age);
        s1.CalPercent(90, 95, 100);
        System.out.println(s1.percentage);
        System.out.println(s1.age);
        
    }
}
class Pen{
    String color;
    int tip;
    void setColor(){
        color="Blue";
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int age=100;
    float percentage;
    void CalPercent(int phy, int chem, int maths){
        percentage=(phy+chem+maths)/3;
        age=19;
    }
}