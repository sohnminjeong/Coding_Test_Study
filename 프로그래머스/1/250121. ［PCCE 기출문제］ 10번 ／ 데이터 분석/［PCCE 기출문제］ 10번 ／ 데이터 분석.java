import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        HashMap<String, Integer> data_type = new HashMap<String, Integer>();
        data_type.put("code", 0);
        data_type.put("date", 1);
        data_type.put("maximum", 2);
        data_type.put("remain", 3);
        
        List<int[]> list = new ArrayList<>();
        for(int[] d : data){
            if(d[data_type.get(ext)]<val_ext){
                list.add(d);
            }
        }
        list.sort(Comparator.comparingInt(arr->arr[data_type.get(sort_by)]));
        
        return list.toArray(new int[0][]);
    }
}