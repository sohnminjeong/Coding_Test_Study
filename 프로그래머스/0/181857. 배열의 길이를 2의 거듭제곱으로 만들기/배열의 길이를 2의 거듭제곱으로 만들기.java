import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        int tLen = 1;
        while(tLen<len){tLen *=2;}
        
        int[] answer = Arrays.copyOf(arr, tLen);
        for(int i=len; i<tLen; i++){
            answer[i]=0;
        }
        
        return answer;
    }
}