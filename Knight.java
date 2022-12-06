import java.util.*;

public class Knight extends Piece {

	public Knight(Coord coord, Boolean color) {
		super(coord, color);
	}

	//not considering pins and blocks
	public ArrayList<Coord> possibleMoves() {
		ArrayList<Coord> output = new ArrayList<Coord>();
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
        if(i == 0 && j == 0){
          continue;
        }
				if (new Coord(coord.row + i * 2, coord.col + j).isOnBoard()) {
					output.add(new Coord(coord.row + i * 2, coord.col + j));
				}
				if (new Coord(coord.row + i, coord.col + j * 2).isOnBoard()) {
					output.add(new Coord(coord.row + i, coord.col + j * 2));
				}
			}
		}
		return output;
	}
}
