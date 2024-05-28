import java.util.*;
class Solution {
    public List solution(int[] num_list, int n) {
        
        // int[] answer = {};
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=num_list.length; i++){
            if(i<=n){
                answer.add(num_list[i-1]);
            }
        }
        return answer;
    }
}