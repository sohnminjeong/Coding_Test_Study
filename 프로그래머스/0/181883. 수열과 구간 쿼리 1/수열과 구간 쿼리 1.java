class Solution {
    public int[] solution(int[] arr, int[][] queries) {
       for(int[] query : queries){
           int a = query[0];
           int b = query[1];
           for(int i=a; i<=b; i++){
               arr[i] += 1;
           }
       }
        return arr;
    }
}