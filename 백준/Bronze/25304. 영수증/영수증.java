import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = sc.nextInt();
        int totalCheck = 0;
        for(int i=1; i<=count; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            totalCheck+=(a*b);
        }
        if(total==totalCheck){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
