class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] alphabet = {"a","e","i","o","u"};
        for(String str : alphabet){
            answer=answer.replaceAll(str, "");
        }
        return answer;
    }
}