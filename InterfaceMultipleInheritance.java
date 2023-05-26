public class InterfaceMultipleInheritance{
    public static void main(String args[]){
        Beer b1 = new Beer();
        b1.grass();
        b1.meat();
    }
}
interface Herbivores{
    void grass();
}
interface Carnivores{
    void meat();
}
class Beer implements Herbivores, Carnivores{
    public void grass(){
        System.out.println("Beer eats grass");
    }
    public void meat(){
        System.out.println("Beer also eats meat");
    }
}
