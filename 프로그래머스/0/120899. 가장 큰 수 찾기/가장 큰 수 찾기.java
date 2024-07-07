class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int num=-1;
        int index=-1;
        for(int i=0; i<array.length; i++){
            if(num<array[i]){
                num=array[i];
                index=i;
            }
        }
        answer[0]=num;
        answer[1]=index;
        return answer;
    }
}