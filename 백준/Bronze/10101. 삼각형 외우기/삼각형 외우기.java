import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String result="";
        int sum = a+b+c;
        if(sum==180){
            if(a==60&b==60&c==60){
                result="Equilateral";    
            } else if(a!=b&&b!=c&&a!=c){
                result="Scalene";
            }else{
                result="Isosceles";
            }
            
        }else{
            result="Error";
        }
        System.out.println(result);
    }
}