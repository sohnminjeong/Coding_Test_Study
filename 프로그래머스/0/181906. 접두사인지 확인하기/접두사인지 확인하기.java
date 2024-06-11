class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        // startsWith 사용 안할 시 -> substring 배열 만들어서 equals 확인
        if(my_string.startsWith(is_prefix)){
            answer=1;
        }
        return answer;
    }
}