package manager;
public class GameBoard {

    public static final int ROW_BOARD_SIZE = 24;
    public static final int COL_BOARD_SIZE = 12;
    public boolean board[][];

    public GameBoard() {
        this.board = new boolean[ROW_BOARD_SIZE][COL_BOARD_SIZE];
    }


    public void updateFigure() {
        clearConsole();
        for (int i = 0; i < ROW_BOARD_SIZE; i++) {
            System.out.print("*");
            for (int j = 0; j < COL_BOARD_SIZE; j++) {
                if (board[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("            *");
        }
        for (int i = 0; i < ROW_BOARD_SIZE + 2; i++) {
            System.out.print("*");
        }

        System.out.println();
    }


    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public void run() {
        updateFigure();


    }
        public void setFigure ( int rowCoordinates, int colCoordinates){
            if ((rowCoordinates >= 0) && (rowCoordinates < ROW_BOARD_SIZE)) {
                if ((colCoordinates >= 0) && (colCoordinates < COL_BOARD_SIZE)) {
                    this.board[rowCoordinates][colCoordinates] = true;
                }
            }
        }

}
