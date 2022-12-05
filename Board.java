//8x8 board
public class Board{
  public Piece[][] board;
  public Player player1;
  public Player player2;
  
  public Board(){
    board = new Piece[8][8];
    player1 = new Player();
    player2 = new Player();
  }

  public void add(Piece p, Coord c){
    board[c.row][c.col] = p; 
  }

  pubic void remove(Coord c){
    board[c.row][c.col] = null;
  }

  public void turnSwitch(){
    player1.turn = !player1.turn;
    player2.turn = !player2.turn;
  }
  
  public void newGame(){
    player1.turn = true;
  }

  public List<Coord> possibleMoves(){
    
  }

  public void draw(Graphics window){
    
  }
}