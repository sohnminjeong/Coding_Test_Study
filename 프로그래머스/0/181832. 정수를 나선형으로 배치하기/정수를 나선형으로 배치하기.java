class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int count = 1;
        int x = 0, y =0;
        int lastX=n-1, lastY=n-1;
        
        while(count<=n*n){
            for(int i=y; i<=lastY; i++){
                answer[x][i]=count++;
            }
            for(int i=x+1; i<=lastX; i++){
                answer[i][lastY] = count++;
            }
            for(int i=lastY-1; i>=y; i--){
                answer[lastX][i]=count++;
            }
            for(int i=lastX-1; i>x; i--){
                answer[i][y]=count++;
            }
            x++;
            y++;
            lastX--;
            lastY--;
        }
        return answer;
    }
}