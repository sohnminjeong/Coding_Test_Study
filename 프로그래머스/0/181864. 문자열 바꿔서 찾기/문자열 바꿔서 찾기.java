class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String replaceStr = myString.replace('A', 'x').replace('B', 'A').replace('x', 'B');
        if(replaceStr.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}