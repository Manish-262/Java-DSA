public class Multi_Level_Inheritance{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.fins=5;
        System.out.println(shark.fins);
    }
}
class Animal{
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swim");
    }
}
class Dolphin extends Fish{
    int teeths;
}