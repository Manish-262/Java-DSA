public class InterfaceAbstraction{
    public static void main(String args[]){
        Queen q1 = new Queen();
        q1.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Move in 4 directions");
    }
} 
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Move in 4 directions with one step");
    }
} 
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Move in horizontal and vertical directions");
    }
} 
class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("Move in diagonal directions");
    }
} 
