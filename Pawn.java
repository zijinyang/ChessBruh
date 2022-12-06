import java.util.*;

public class Pawn extends Piece {
	private boolean moved;

	public Pawn(Coord coord, boolean color) {
		super(coord, color);
		moved = false;
	}

	// not considering pins and blocks
	public ArrayList<Coord> possibleMoves() {
		ArrayList<Coord> output = new ArrayList<Coord>();
		if (bwhite){
      if(!moved){
        if(new Coord(coord.row, coord.col + 1).isOnBoard()){
          output.add(new Coord(coord.row, coord.col + 1));
        }
        if(new Coord(coord.row, coord.col + 2).isOnBoard()){
          output.add(new Coord(coord.row, coord.col + 2));
        }
      }else{
        if(new Coord(coord.row, coord.col + 1).isOnBoard()){
          output.add(new Coord(coord.row, coord.col + 1));
        }
      }
    }else{
      if(!moved){
        if(new Coord(coord.row, coord.col - 1).isOnBoard()){
          output.add(new Coord(coord.row, coord.col + 1));
        }
        if(new Coord(coord.row, coord.col - 2).isOnBoard()){
          output.add(new Coord(coord.row, coord.col + 2));
        }
      }else{
        if(new Coord(coord.row, coord.col - 1).isOnBoard()){
          output.add(new Coord(coord.row, coord.col + 1));
        }
      }
    }
		return output;
	}
}
