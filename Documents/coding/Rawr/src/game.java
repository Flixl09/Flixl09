public class game {
    //write a game of chess
    public static void main(String[] args) {
        //create a chessboard
        String[][] board = new String[8][8];
        //fill the board with empty spaces
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = " ";
            }
        }
        //fill the board with the pieces
        for(int i = 0; i < board.length; i++){
            board[1][i] = "P";
            board[6][i] = "P";
        }
        board[0][0] = "R";
        board[0][7] = "R";
        board[7][0] = "R";
        board[7][7] = "R";
        board[0][1] = "N";
        board[0][6] = "N";
        board[7][1] = "N";
        board[7][6] = "N";
        board[0][2] = "B";
        board[0][5] = "B";
        board[7][2] = "B";
        board[7][5] = "B";
        board[0][3] = "Q";
        board[7][3] = "Q";
        board[0][4] = "K";
        board[7][4] = "K";
        //print the board
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    //add a method to move pieces
    public static void movePiece(String[][] board, int x1, int y1, int x2, int y2){
        board[x2][y2] = board[x1][y1];
        board[x1][y1] = " ";
    }

    //add a method to check if a move is valid


}
