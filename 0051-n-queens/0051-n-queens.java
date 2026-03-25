class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> final_board = new ArrayList<>();
        char chessBoard[][] = new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessBoard[i][j]='.';
            }
        }

        createConfiguration(final_board,chessBoard,0);
        return final_board;
    }

    public boolean isValid(char chessBoard[][],int row,int col){

        for(int i=0;i<chessBoard.length;i++){
            if(chessBoard[row][i]=='Q') return false;
        }

        for(int i=0;i<chessBoard.length;i++){
            if(chessBoard[i][col]=='Q') return false;
        }

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chessBoard[i][j]=='Q') return false;
        }

        for(int i=row-1,j=col+1;i>=0 && j<chessBoard.length;i--,j++){
            if(chessBoard[i][j]=='Q') return false;
        }

        return true;
    }

    public void createConfiguration(List<List<String>> final_board,char chessBoard[][],int row){

        if(row==chessBoard.length){

            List<String> board = new ArrayList<>();
            for(int i=0;i<chessBoard.length;i++){
                board.add(new String(chessBoard[i]));
            }

            final_board.add(board);
            return;
        }

        for(int col=0;col<chessBoard.length;col++){

            if(isValid(chessBoard,row,col)){

                chessBoard[row][col]='Q';

                createConfiguration(final_board,chessBoard,row+1);

                chessBoard[row][col]='.';
            }
        }
    }
}