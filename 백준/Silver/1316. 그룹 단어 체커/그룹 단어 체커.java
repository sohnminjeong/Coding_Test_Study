import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = num;
        for(int i=0; i<num; i++){
            String str = sc.next();
            int[] arr = new int[26];
            for(int j=0; j<str.length(); j++){
                if(arr[str.charAt(j)-'a']==0){
                    arr[str.charAt(j)-'a']++;
                } else if(j>0 && str.charAt(j)!=str.charAt(j-1)){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}