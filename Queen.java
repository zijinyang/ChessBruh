import java.util.*;

public class Queen extends Piece {

	public Queen(Coord c, boolean color) {
		super(c);
	}

	//not considering pins and blocks
	public ArrayList<Coord> possibleMoves() {
		ArrayList<Coord> output = new ArrayList<Coord>();
		Coord end;
		for (int magnitude = 1; magnitude < 8; magnitude++) {
			for (int drow = -1; drow <= 1; drow++) {
				for (int dcol = -1; dcol <= 1; dcol++) {
					if (drow == 0 && dcol == 0) {
						continue;
					}
					end = new Coord(coord.row + drow * magnitude, coord.col + dcol * magnitude);
					if (end.isOnBoard()) {
						output.add(end);
					}
				}
			}
		}
		return output;
	}

	public String toString() {
		return "Q";
	}
}
