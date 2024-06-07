import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       
        for(int i=0; i<num; i++){
           String a = sc.next();
            System.out.print(a.charAt(0));
            System.out.println(a.charAt(a.length()-1));
        }
    }
}