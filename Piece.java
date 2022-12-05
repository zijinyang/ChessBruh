public interface Piece {
	private int row, col;

	public void setRow(int row);
	public void setCol(int col);
	public int getRow();
	public int getCol();

	public Coord getCoord();
	public void setCoord(Coord coord);

	public ArrayList<Coord> possibleMoves();
	public boolean move(int drow, int dcol);
}
