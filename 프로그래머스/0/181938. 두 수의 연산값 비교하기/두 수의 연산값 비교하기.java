class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = Integer.toString(a)+Integer.toString(b);
        int abab = 2*a*b;
        int abNum = Integer.parseInt(ab);
        if(abNum>abab || abNum==abab){
            answer = abNum;
        } else if(abNum<abab){
            answer = abab;
        }
        return answer;
    }
}