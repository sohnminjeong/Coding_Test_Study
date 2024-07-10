import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int a = sides[0];
        int b = sides[1]; 
        for(int i=1; i<=b; i++){
            if(b<a+i){
                answer++;
            }
        }
        for(int j=b+1; j<a+b; j++){
            answer++;
        }
        return answer;
    }
}