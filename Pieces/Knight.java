import java.util.*;

public class Knight implements Piece{  


  //not considering pins and blocks
  public ArrayList<Coord> possibleMoves(Board b){
    List<Coord> output = new ArrayList<Coord>();
    for(int i = -1; i <= 1; i++){
      for(int j = -1; j <= 1; j++){ 
        if(new Coord(row + i*2, col + j).isOnBoard()){
          output.add(new Coord(row + i*2, col + j));
        }
        if(new Coord(row + i, col + j*2).isOnBoard()){
          output.add(new Coord(row + i, col + j*2));
        }
      }
    }
  }
  
	public boolean move(Coord d, Board b){
    return possibleMoves(b).contains(d);
  }
}