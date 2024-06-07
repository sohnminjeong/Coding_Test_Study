import java.util.*;
class Solution {
    public List solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> answer = new ArrayList<Integer>();
        for(int i=0; i<intStrs.length; i++){
            String str = intStrs[i].substring(s, s+l);
           int num = Integer.valueOf(str);
            if(num>k){
                answer.add(num);
            }
        }
        return answer;
    }
}