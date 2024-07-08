class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] str = Integer.toString(n).split("");
        for(String st : str){
            answer+=Integer.parseInt(st);
        }
        return answer;
    }
}