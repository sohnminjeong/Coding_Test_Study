import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        List<int[]> list = new ArrayList<>();
        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] dy = {1, 1, 1, 0, 0, -1, -1, -1};
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]==1){
                    int[] temp = {i, j};
                    list.add(temp);
                }
            }
        }
        
        for(int k=0; k<list.size(); k++){
            int i=list.get(k)[0];
            int j = list.get(k)[1];
            for(int a=0; a<8; a++){
                if(dx[a]+i >=0 && dy[a]+j>=0 && dx[a]+i<=board.length-1 && dy[a]+j<=board.length-1){
                    board[dx[a]+i][dy[a]+j]=1;
                }
            }
        }
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}