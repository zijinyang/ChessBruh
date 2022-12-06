import java.util.*;

public class Rook extends Piece{  

  public Rook(Coord c, boolean color){
    super(c);
  }
  
  //not considering pins and blocks
  public ArrayList<Coord> possibleMoves(){
    ArrayList<Coord> output = new ArrayList<Coord>();
		for (int magnitude = 1; magnitude < 8; magnitude++) {
			for (int drow = -1; drow <= 1; drow++) {
        if (drow == 0) {
					continue;
				}
				Coord end = new Coord(coord.row + drow * magnitude, coord.col);
				if (end.isOnBoard()) {
					output.add(end);
				}
      }
			for (int dcol = -1; dcol <= 1; dcol++) {
				if (dcol == 0) {
					continue;
				}
				Coord end = new Coord(coord.row, coord.col + dcol * magnitude);
				if (end.isOnBoard()) {
					output.add(end);
				}
			}
		}
		return output;
	}
}