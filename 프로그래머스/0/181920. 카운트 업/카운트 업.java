import java.util.*;
class Solution {
    public List solution(int start_num, int end_num) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=start_num; i<=end_num; i++){
           list.add(i); 
        }
        return list;
    }
}