class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int ans = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(i%2!=0){
                answer+=num_list[i];
            } else if(i%2==0){
                ans+=num_list[i];
            }
        }
        return answer>ans ? answer : ans;
       
    }
}