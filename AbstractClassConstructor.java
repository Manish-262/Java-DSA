public class AbstractClassConstructor{
    public static void main(String args[]){
        Fish f1 = new Fish();
        }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called...");
    }
    void eat(){
        System.out.println("Eats anything");
    }
    abstract void walk();
}
class Deer extends Animal{
    Deer(){
        System.out.println("Deer constructor called...");
    }
    void changecolor(){
        color="Light Brown";
    }
    void walk(){
        System.out.println("4 legs");
    }
}
class Fish extends Deer{
    Fish(){
        System.out.println("Fish constructor called...");
    }
    void changecolor(){
        color="Blue";
    }
    void walk(){
        System.out.println("Fish swims");
    }
}