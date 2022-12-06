import java.util.*;

public abstract class Piece {
	public Coord coord;
	public boolean bwhite;

	public Piece(Coord coord, boolean bwhite) {
		this.coord = coord;
		this.bwhite = bwhite;
	}

	public Coord getCoord(){
		return coord;
	}

	public void setCoord(Coord coord){
		this.coord = coord;
	}

	public abstract List<Coord> possibleMoves();
}
