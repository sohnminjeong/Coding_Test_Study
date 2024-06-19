import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answers = myString.split("x");
        List<String> ans = new ArrayList<>();
        for(String str : answers){
            if(!str.isEmpty()){
                ans.add(str);
            }
        }
        String[] answer = new String[ans.size()];
        answer = ans.toArray(answer);
        Arrays.sort(answer);
        return answer;
    }
}