class Solution {
    public int[] solution(int[] arr, int n) {
        
        for(int i=0; i<arr.length; i++){
            if(arr.length%2==0 && i%2!=0){
                arr[i] = arr[i]+n;
            } else if(arr.length%2!=0 && i%2==0){
                arr[i] = arr[i]+n;
            } else {
                arr[i] = arr[i];
            }
        }
        return arr;
    }
}