class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int a = my_string.length();
        answer = my_string.substring(a-n, a);
        return answer;
    }
}