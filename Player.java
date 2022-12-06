import java.util.List;
import java.util.ArrayList;

public class Player {
	public List<Piece> taken;
	public Boolean turn;

	public Player() {
		taken = new ArrayList<Piece>();
		turn = false;
	}

}