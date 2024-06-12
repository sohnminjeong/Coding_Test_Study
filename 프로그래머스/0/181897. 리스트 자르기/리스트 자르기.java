import java.util.*;
class Solution {
    public List solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
            if(n==1){
                for(int j=0; j<=slicer[1]; j++){
                    answer.add(num_list[j]);
                }
            } else if(n==2){
                for(int j=slicer[0]; j<num_list.length; j++){
                    answer.add(num_list[j]);
                }
            } else if(n==3){
                for(int j=slicer[0]; j<=slicer[1]; j++){
                    answer.add(num_list[j]);
                }
            } else if(n==4){
                for(int j=slicer[0]; j<=slicer[1]; j+=slicer[2]){
                    answer.add(num_list[j]);
                }
            }
        
        return answer;
    }
}