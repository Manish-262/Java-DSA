public class AbstractClass{
    public static void main(String args[]){
        Deer d1 = new Deer();
        d1.eat();
        d1.walk();
        //System.out.println(d1.color);
        d1.changecolor();
        System.out.println(d1.color);
        Fish f1 = new Fish();
        f1.eat();
        f1.walk();
        }
}
abstract class Animal{
    String color;
    Animal(){
        color="Brown";
    }
    void eat(){
        System.out.println("Eats anything");
    }
    abstract void walk();
}
class Deer extends Animal{
    void changecolor(){
        color="Light Brown";
    }
    void walk(){
        System.out.println("4 legs");
    }
}
class Fish extends Animal{
    void changecolor(){
        color="Blue";
    }
    void walk(){
        System.out.println("Fish swims");
    }
}