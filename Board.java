import java.util.List;
import java.util.ArrayList;
import java.awt.Graphics;

//8x8 board
public class Board{
  public Space[][] board;
  public ArrayList<Piece> pieces;
  public Player player1;
  public Player player2;

  public Board(){
    board = new Space[8][8];
    player1 = new Player();
    player2 = new Player();
  }

  public void add(Piece p, Coord c){
    board[c.row][c.col].add(p);
  }

  public void remove(Coord c){
    board[c.row][c.col] = null;
  }

  public void turnSwitch(){
    player1.turn = !player1.turn;
    player2.turn = !player2.turn;
  }

  public void newGame(){
    player1.turn = true;
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; i++) {
        board[i][j] = new Space(i, j);
      }
    }
    board[0][0].add(new Rook(0, 0));
  }

  public List<Coord> possibleMoves(){
    
  }

  public void draw(Graphics window){

  }

	
}
