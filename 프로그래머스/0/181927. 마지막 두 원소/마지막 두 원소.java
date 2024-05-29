import java.util.*;
class Solution {
    public List solution(int[] num_list) {

        List<Integer> answer = new ArrayList<>();
  
for(int i=0;i<num_list.length;i++){
    answer.add(num_list[i]);
    if(i==(num_list.length-1)){
        if(num_list[i]>num_list[i-1]){
            answer.add(num_list[i]-num_list[i-1]);
        } else{
            answer.add(num_list[i]*2);
        }
    }
}
        return answer;
    }
}