class AIPlayer extends Player{
    public AIPlayer(char symbol, Board board, String name) {
        super(symbol, board, name);
    }

    @Override
    public void makeMove(Board board) {
        board.AImove(board, symbol, name);
    }
}