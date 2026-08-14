public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        //rows
        for (int i = 0; i < 9; i++) {
            int[] count= new int[9];
            for (int j = 0; j < 9; j++) {
                if(board[i][j]!='.'){
                    int index=board[i][j]-'1';
                    count[index]++;
                    if(count[index]>1){
                        return false;
                    }
                }
                
            }
        }
        //columns
        for (int j = 0; j < 9; j++) {
            int[] count= new int[9];
            for (int i= 0; i < 9; i++) {
                if(board[i][j]!='.'){
                    int index=board[i][j]-'1';
                    count[index]++;
                    if(count[index]>1){
                        return false;
                    }
                }
                
            }
        }
        //3x3 block
        for (int blockRow = 0; blockRow < 9; blockRow += 3) {
            for (int blockColumn = 0; blockColumn < 9; blockColumn += 3) {
                int[] count=new int[9];
                for (int i = blockRow; i < blockRow+3; i++) {
                    for (int j = blockColumn; j < blockColumn+3; j++) {
                        if(board[i][j]!='.'){
                            int index=board[i][j]-'1';
                            count[index]++;
                            if(count[index]>1){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
