class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int i = myString.lastIndexOf(pat);
        answer=myString.substring(0, i) + pat;
        return answer;
    }
}