public class Hierarchial_Inheritance{
    public static void main(String args[]){
        Mamals m1 = new Mamals();
        m1.eat();
    }
}
class Animals{
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Mamals extends Animals{
    void walk(){
        System.out.println("Walk");
    }
}
class Tiger extends Animals{
    int teeths;
}