import java.util.*;

public class Bishop extends Piece{  

  public Bishop(Coord c, boolean color){
    super(c, color);
  }
  
  //not considering pins and blocks
  public ArrayList<Coord> possibleMoves(){
    ArrayList<Coord> output = new ArrayList<Coord>();
		for (int magnitude = 1; magnitude < 8; magnitude++) {
			for (int x = -1; x <= 1; x++) {
				if (x == 0) {
					continue;
				}
				Coord end = new Coord(coord.row + x * magnitude, coord.col + x * magnitude);
				if (end.isOnBoard()) {
					output.add(end);
				}
			}
		}
		return output;
	}
}