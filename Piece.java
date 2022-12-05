public interface Piece {
	public Coord c;

	public default Coord getCoord(){
    return c;
  }

	public void setCoord(Coord coord){
    c = coord
  }

	public ArrayList<Coord> possibleMoves();
	public boolean move(Coord d);
}
