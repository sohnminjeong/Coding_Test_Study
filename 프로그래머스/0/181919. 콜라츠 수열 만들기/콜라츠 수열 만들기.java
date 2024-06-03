import java.util.*;
class Solution {
    public List solution(int n) {
        List<Integer> list = new ArrayList<Integer>();
        int a = n;
        while(a!=1){
            list.add(a);
            if(a%2==0){
                a = a/2;
            } else if(a%2!=0){
                a = 3*a+1;
            }
        }
        if(a==1){
            list.add(a);
        }
        return list;
    }
}