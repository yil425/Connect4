import java.util.Scanner;
class HumanPlayer extends Player{
    public HumanPlayer(char symbol, Board board, String name) {
        super(symbol, board, name);
    }

    @Override
    public void makeMove(Board board) {
        board.Move(board, symbol, name);
    }
}