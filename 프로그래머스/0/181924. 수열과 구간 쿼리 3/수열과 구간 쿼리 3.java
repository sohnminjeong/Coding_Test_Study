class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int A; 
        for(int i=0; i<queries.length; i++){
            A = arr[queries[i][0]];
            arr[queries[i][0]]=arr[queries[i][1]];
            arr[queries[i][1]]=A;
        }
        return arr;
    }
}