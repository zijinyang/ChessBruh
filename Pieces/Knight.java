import java.util.*;

public class Knight implements Piece{  
  public ArrayList<Coord> possibleMoves(Board b){
    
  }
  
	public boolean move(Coord d, Board b){
    return possibleMoves(b).contains(d);
  }
}