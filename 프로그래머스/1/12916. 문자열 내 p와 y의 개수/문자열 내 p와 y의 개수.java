class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a =0; int b=0;
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p'){
                a++;
            } else if(s.charAt(i)=='y'){
                b++;
            }
        }
        if(a!=b) {answer=false;}
        return answer;
    }
}