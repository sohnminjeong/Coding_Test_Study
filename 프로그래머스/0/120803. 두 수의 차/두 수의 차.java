class Solution {
    public int solution(int num1, int num2) {
        boolean answer = -50000<=num1&&num1<=50000&&-50000<=num2&&num2<=50000 ? true:false;
        int result = -1;
        if(answer) result=num1-num2;
        return result;
    }
}