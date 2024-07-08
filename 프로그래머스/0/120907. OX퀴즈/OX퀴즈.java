class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String arr[] = quiz[i].split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            
            int left = arr[1].equals("+") ? a+b : a-b;
            int right = Integer.parseInt(arr[4]);
            
            answer[i] = left==right ? "O" : "X";
        }
        
        return answer;
    }
}