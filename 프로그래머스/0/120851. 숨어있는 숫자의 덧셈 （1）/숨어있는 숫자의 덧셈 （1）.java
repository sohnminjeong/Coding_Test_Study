class Solution {
    public int solution(String my_string) {
        
        my_string = my_string.replaceAll("[a-zA-Z]","");
        String[] str = my_string.split("");
        
        int answer = 0;
        for(String i : str){
            answer += Integer.parseInt(i);
        }
        return answer;
    }
}