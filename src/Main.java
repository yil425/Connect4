public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        ConnectFour connectFour = new ConnectFour(board);
        HumanPlayer humanPlayer = new HumanPlayer('A', board, "Player");
        AIPlayer aiPlayer = new AIPlayer('B', board, "AI");
        connectFour.setPlayer1(humanPlayer);
        connectFour.setPlayer2(aiPlayer);
        connectFour.playGame();
    }
}