public class Getters_and_Setters{
    public static void main(String args[]){
        pen p1 = new pen();
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());
        p1.dosetTip(5);
        System.out.println(p1.dogetTip());
        p1.setnum();
        System.out.println(p1.getnum());
    }
}
class pen{
    private String color;
    private int Tip;
    private int num;
    String getcolor(){
        return this.color;
    }
    void setcolor(String color){
        this.color=color;
    }
    int dogetTip(){
        return this.Tip;
    }
    void dosetTip(int newtip){
        Tip=newtip;
    }
    int getnum(){
        return this.num;
    }
    void setnum(){
        num=55;
    }

}