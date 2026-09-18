class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            Set<Character> row = new HashSet<>();
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == '.') {
                        continue;
                }
                if(row.contains(board[i][j])) return false;
                row.add(board[i][j]);
            }
        }

        for(int i = 0; i < board.length; i++) {
            Set<Character> col = new HashSet<>();
            for(int j = 0; j < board.length; j++) {
                if(board[j][i] == '.') {
                        continue;
                }
                if(col.contains(board[j][i])) return false;
                col.add(board[j][i]);
            }
        }

        for(int i = 0; i < board.length; i++) {
            Set<Character> seen = new HashSet<>();
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    int row = (i / 3) * 3 + j;
                    int col = (i % 3) * 3 + k;
                    if(board[row][col] == '.') {
                        continue;
                    }
                    if(seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
