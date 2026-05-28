class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < board.length; i++){
            int[] zeroToNineR = new int[9];
            int[] zeroToNineC = new int[9];

            for(int x = 0; x < board.length; x++){
                int pos = Integer.parseInt((board[i][x] == '.' ? -1 : board[i][x] - '0') + "");
                int posC = Integer.parseInt((board[x][i] == '.' ? -1 : board[x][i] - '0') + "");
        
                if(pos >= 0){
                    pos--;
                    if(zeroToNineR[pos] != 0){
                        return false;
                    }




                    zeroToNineR[pos] = 1;
                }

                if(posC >= 0){
                    posC--;
                    if(zeroToNineC[posC] != 0){
                        return false;
                    }

                    zeroToNineC[posC] = 1;
                }
            }
        }

        for(int i = 0; i < 7; i += 3){
            for(int b = 0; b < 7; b += 3){
                int[] zeroToNineS = new int[9];

                for(int x = i; x < i + 3; x++){
                    for(int v = b; v < b + 3; v++){
                        int pos = Integer.parseInt((board[x][v] == '.' ? -1 : board[x][v] - '0') + "");                    
                        
                        if(pos >= 0){
                            --pos;
                            //System.out.print("PosVal:" + zeroToNineS[pos] + "|X:" + x + "|V:" + v + "|Value:" + pos);
                            if(zeroToNineS[pos] != 0){
                                return false;
                            }

                            zeroToNineS[pos] = 1;
                        }
                    }
                }
            }
        }

        return true;
    }
}
