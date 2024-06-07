import java.io.*;
import java.util.*;

class Solution {
    public StringBuilder solution(String my_string, int[][] queries) {
        StringBuilder str= new StringBuilder(my_string);
        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            // substring으로 start~end구역 문자열 자르기
            StringBuilder s = new StringBuilder(str.substring(start, end+1));
            // reverse 메서드 : 문자열 뒤집기
            s.reverse();
            // toString : 문자열 반환
            str.replace(start, end+1, s.toString());
        }
        return str;
    }
}