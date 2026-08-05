class Solution {
    public boolean isValidSudoku(char[][] board) {
       
       // check rows
       for(int rows = 0; rows < 9; rows++){
        Set<Integer> set = new HashSet<>();
        for(int cols = 0; cols < 9; cols++){
                int num = board[rows][cols] -'0';
                if(board[rows][cols]=='.') continue;
                if(set.contains(num)){
                    return false;
                }
                set.add(num);
            }
        }
       
        // check cols
       for(int cols = 0; cols < 9; cols++){
            Set<Integer> set = new HashSet<>();
            for(int rows = 0; rows < 9; rows++){
                int num = board[rows][cols] -'0';
                if(board[rows][cols]=='.') continue;
                if(set.contains(num)){
                    return false;
                }
                set.add(num);
            }
        }
        // check grid
        for(int sr = 0; sr < 9; sr+=3){
            int er = sr+3;
            for(int sc = 0; sc < 9; sc+=3){
                int ec = sc + 3;
                
                if(!traverse(board, sr, er, sc, ec)) return false;
            }
        }

       return true;
    }

    private boolean traverse(char[][] board, int sr, int er, int sc, int ec){
        Set<Integer> set = new HashSet<>();
        for(int i = sr; i < er; i++ ){
            for(int j = sc; j < ec; j++){
                if(board[i][j]=='.') continue;
                int num = board[i][j] -'0';
                if(set.contains(num)){
                    return false;
                }
                set.add(num);
            }
        }
        return true;
    }
}