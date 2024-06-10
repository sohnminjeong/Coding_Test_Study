import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 모두 대문자로 변환
        String a = sc.nextLine().toUpperCase();
        sc.close();
        
        // 알파벳 배열 선언
        int[] arr = new int[26];
        int max=0;  // 반복횟수
        char result=0;  // 결과
        
        for(int i=0; i<a.length(); i++){
            // 65='A'
            arr[a.charAt(i)-65]++;
            if(max<arr[a.charAt(i)-65]){
                max=arr[a.charAt(i)-65];
                result=a.charAt(i);
            } else if(max==arr[a.charAt(i)-65]){
                result='?';
            }
        }
        System.out.println(result);
    }
}