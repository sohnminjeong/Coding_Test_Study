import java.util.*;
class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        for(int j=0; j<arr.length; j++){
            for(int k=0; k<delete_list.length; k++){
                if(arr[j]==delete_list[k]){
                    list.remove(Integer.valueOf(arr[j]));
                }
            }
        }
        return list;
    }
}