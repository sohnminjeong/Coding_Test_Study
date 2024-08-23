import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pNum = p.length();
        long num = Long.parseLong(p);
        
        for(int i=0; i<t.length()-pNum+1; i++){
            long num1 = Long.parseLong(t.substring(i,i+pNum));
            if(num1<=num) answer++;
        }
        return answer;
    }
}