class Solution {
    public boolean isValidSudoku(char[][] board) {
        //loop through row
        for(int row = 0; row < 9; row++){
            Set<Character> inRow = new HashSet<>();
            for(int col = 0; col < 9; col++){
                char curr = board[row][col];
                if(curr != '.'){
                    if(inRow.contains(curr)){
                        return false;
                    }
                    inRow.add(curr);
                }
            }
        }
        //loop through col
        for(int col = 0; col < 9; col++){
            Set<Character> inCol = new HashSet<>();
            for(int row = 0; row < 9; row++){
                char curr = board[row][col];
                if(curr != '.'){
                    if(inCol.contains(curr)){
                        return false;
                    }
                    inCol.add(curr);
                }
            }
        }
        //loop through square
        for(int square = 0; square < 9; square++){
            Set<Character> inSquare = new HashSet<>();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    int row = (square/3) * 3 + i;
                    int col = (square%3) * 3 + j;
                    char curr = board[row][col];
                    if(curr != '.'){
                        if(inSquare.contains(curr)){
                            return false;
                        }
                        inSquare.add(curr);
                    }
                }
            } 
        }

        return true;
    }
}
