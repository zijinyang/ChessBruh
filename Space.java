public class Space {
	public boolean boccupied;
	public Piece piece;
	public Coord coord;

	public Space(int row, int col) {
		this.boccupied = false;
		this.piece = null;
		this.coord = new Coord(row, col);
	}

	public void add(Piece p) {
		piece = p;
		boccupied = true;
	}

	public void remove() {
		piece = null;
		boccupied = false;
	}
	
	public boolean isEmpty() {
		return !boccupied;
	}

	public String toString() {
		return piece.toString();
	}
}
