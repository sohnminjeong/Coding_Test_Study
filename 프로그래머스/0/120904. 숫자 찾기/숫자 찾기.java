class Solution {
    public int solution(int num, int k) {
        
        String[] str = Integer.toString(num).split("");
        for(int i=1; i<=str.length; i++){
            if(str[i-1].equals(Integer.toString(k))){
                return i;
            }
        }
        return -1;
    }
}