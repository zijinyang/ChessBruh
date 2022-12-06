public class Coord {
	public int row, col;

	public Coord(int row, int col) {
		this.row = row;
		this.col = col;
	}

  public boolean isOnBoard(){
    return row >= 0 && row < 8 && col >= 0 && col < 8;
  }

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Coord coord = (Coord) o;
		return row == coord.row && col == coord.col;
	}
}
