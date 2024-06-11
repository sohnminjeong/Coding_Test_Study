import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String a = my_string.substring(s, e+1);
        StringBuffer str = new StringBuffer(a);
        String reverseStr = str.reverse().toString();
        my_string = my_string.replace(a, reverseStr);
        return my_string;
    }
}